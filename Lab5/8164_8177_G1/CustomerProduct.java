package backend;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerProduct implements backend.Record {
    private String customerssn;
    private String productid;    
    private LocalDate purchaseDate;
    
public CustomerProduct(String ssn, String pi, LocalDate pd){
    customerssn = ssn;
    productid = pi;
    purchaseDate = pd;
}   

public String getCustomerSSN(){
    return customerssn; 
}
public String getProductID(){
    return productid; 
}
public LocalDate getPurchaseDate(){
    return purchaseDate;
}

@Override
public String lineRepresentation(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    return customerssn+","+productid+","+formatter.format(purchaseDate);
}

@Override
public String getSearchKey(){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    return customerssn+","+productid+","+formatter.format(purchaseDate);
} 
}