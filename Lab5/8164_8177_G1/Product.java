package backend;

public class Product implements backend.Record {
    private String productid;
    private String productname;    
    private String manufacturername;
    private String suppliername; 
    private int quantity;
    private float price; 
    
public Product(String id, String pn, String mn, String sn, int q, float p)
{
 productid = id;   
 productname = pn;
 manufacturername = mn;
 suppliername = sn;
 quantity = q;
 price = p;
}

public int getquantity(){
    return quantity; 
}
public void setquantity(int q){
    quantity = q; 
}

@Override
public String lineRepresentation(){
  return productid+","+productname+","+manufacturername+","+suppliername+","+quantity+","+price;
}

@Override
public String getSearchKey(){
    return productid; 
}  
public String getproductname(){
    return productname; 
}  
public String getmanufacturername(){
    return manufacturername; 
}  
public String getsuppliername(){
    return suppliername; 
}
public float getprice(){
    return price; 
}  
}
