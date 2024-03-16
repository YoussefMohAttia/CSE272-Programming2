package backend;
import static constants.FileNames.CUSTOMERPRODUCT_FILENAME;
import static constants.FileNames.PRODUCT_FILENAME;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRole {
    
    private ProductDatabase productsDatabase;
    private CustomerProductDatabase customerProductDatabase;

public EmployeeRole(){
    productsDatabase = new ProductDatabase(PRODUCT_FILENAME);
    customerProductDatabase = new CustomerProductDatabase(CUSTOMERPRODUCT_FILENAME);
    productsDatabase.readFromFile();
    customerProductDatabase.readFromFile();
}

public void addProduct(String id, String pn, String mn, String sn, int q,float p){
    productsDatabase.insertRecord(productsDatabase.createRecordFrom(id+","+pn+","+mn+","+sn+","+q+","+p));
//    productsDatabase.saveToFile();
}

public Product[] getListOfProducts(){
    Product[] temp = new Product[productsDatabase.getcount()];
    temp = productsDatabase.returnAllRecords().toArray(temp);
    return temp;
}

public CustomerProduct[] getListOfPurchasingOperations(){
    CustomerProduct[] temp = new CustomerProduct[customerProductDatabase.getcount()];
    temp = customerProductDatabase.returnAllRecords().toArray(temp);
    return temp;
}

public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate){
    int i;
    
    if(productsDatabase.contains(productID))
    {
     Product temp = (Product) productsDatabase.getRecord(productID);
     if(temp.getSearchKey().equals(productID) && temp.getquantity()==0)
     {
      System.out.println("Product with Id "+productID+" has quantity = 0.");          
      return false;    
     }
     else if(temp.getSearchKey().equals(productID) && temp.getquantity()>0)
     {
      System.out.println("Product with Id "+productID+" is found.");             
      temp.setquantity(temp.getquantity()-1);
      //
      Scanner sc = new Scanner(purchaseDate.toString());
      sc.useDelimiter("-");  
      String y = sc.next();
      String m = sc.next();
      String d = sc.next(); 
      sc.close();
      customerProductDatabase.insertRecord(customerProductDatabase.createRecordFrom(customerSSN+","+productID+","+d+"-"+m+"-"+y));
//      customerProductDatabase.saveToFile();
//      productsDatabase.saveToFile();
      return true;
     }
    }
    System.out.println("Product with Id "+productID+" not found.");          
    return false;
}

public double returnProduct(String SSN,String ID,LocalDate purchaseDate,LocalDate returnDate){
    int i;
    float price=0;
    Scanner sc = new Scanner(purchaseDate.toString());
    sc.useDelimiter("-");  
    String y = sc.next();
    String m = sc.next();
    String d = sc.next(); 
    sc.close();
  
   if(returnDate.isBefore(purchaseDate)||
      productsDatabase.contains(ID)==false||
      customerProductDatabase.contains(SSN+","+ID+","+d+"-"+m+"-"+y)==false||
      purchaseDate.until(returnDate,ChronoUnit.DAYS)>14)
       return -1;
   else{
        Product temp = (Product) productsDatabase.getRecord(ID);
        for(i=0;i<productsDatabase.getcount();i++)
         {
             if(temp.getSearchKey().equals(ID))
             {
             price = temp.getprice();
             temp.setquantity(temp.getquantity()+1);
             break;
             }
           //  productsDatabase.setproduct(temp);
         }
        customerProductDatabase.deleteRecord(SSN+","+ID+","+d+"-"+m+"-"+y);
//        customerProductDatabase.saveToFile();
//       productsDatabase.saveToFile();
        return price;
   }
}

public void logout(){
    customerProductDatabase.saveToFile();
    productsDatabase.saveToFile();    
}

}
