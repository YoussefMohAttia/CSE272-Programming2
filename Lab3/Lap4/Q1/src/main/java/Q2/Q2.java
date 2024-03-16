package Q2;

import com.mycompany.q1.Record;
import java.time.LocalDate;

public class Q2 {
public static void main(String[] args) {
   int i;
    ProductDatabase pd = new ProductDatabase("Products.txt");
    pd.readFromFile();
    pd.returnAllRecords();  
    pd.contains("P2000");
    pd.contains("P1000");
    Record p =pd.getRecord("P2000");    
    System.out.print(p.lineRepresentation()+"\r\n");
    pd.getRecord("P1000");  
    pd.deleteRecord("P2001");    
    Product p2 = new Product("P2008","Tv","Sony","Tech",6,120);
    pd.insertRecord(p2);
    System.out.print(pd.getcount()+"\r\n");
    pd.saveToFile();
    
    System.out.print("////////////////////////////////////////////////////\r\n");    
    
    CustomerProductDatabase cpd = new CustomerProductDatabase("CustomersProducts.txt");
    cpd.readFromFile();
    cpd.returnAllRecords();  
    cpd.contains("7000000001,P2501,10-01-2022");
    cpd.contains("8800000000,P2506,15-06-2023");
    Record cp = cpd.getRecord("7000000001,P2501,10-01-2022");    
    System.out.print(cp.lineRepresentation()+"\r\n");
    cpd.getRecord("8800000000,P2501,10-01-2022");  
    cpd.deleteRecord("7000000002,P2502,11-02-2022");    
    CustomerProduct cp2 = new CustomerProduct("7000000007","P2507",LocalDate.of(2022, 07, 16));
    cpd.insertRecord(cp2);
    System.out.print(cpd.getcount()+"\r\n");
    cpd.saveToFile();
    
    System.out.print("////////////////////////////////////////////////////\r\n");    
    
    EmployeeRole er = new EmployeeRole();
    er.addProduct("P2009","Tv","Sony","Tech",21,125);
    Product[] temp;
    temp = er.getListOfProducts();
    CustomerProduct[] temp2;
    temp2 = er.getListOfPurchasingOperations();
    for(i=0;i<temp.length;i++)
      System.out.print(temp[i].lineRepresentation()+"\r\n");
    for(i=0;i<temp2.length;i++)
      System.out.print(temp2[i].lineRepresentation()+"\r\n");
    
    er.purchaseProduct("3333333333","P2002",LocalDate.of(2023,05,05));
    er.purchaseProduct("5555555555","P2000",LocalDate.of(2023,05,05));  
    er.purchaseProduct("5555555555","P1000",LocalDate.of(2023,05,05));
    
    System.out.println(er.returnProduct("5555555555","P2005",LocalDate.of(2023,05,05),LocalDate.of(2023,04,05)));
    System.out.println(er.returnProduct("5555555555","P1000",LocalDate.of(2023,05,05),LocalDate.of(2023,05,05)));
    System.out.println(er.returnProduct("9555555555","P2005",LocalDate.of(2023,05,05),LocalDate.of(2023,05,05)));
    System.out.println(er.returnProduct("5555555555","P2005",LocalDate.of(2023,05,05),LocalDate.of(2023,05,25)));
    System.out.println(er.returnProduct("5555555555","P2005",LocalDate.of(2023,05,05),LocalDate.of(2023,05,15)));
    er.logout();
}
}  
