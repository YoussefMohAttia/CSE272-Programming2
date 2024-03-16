package backend;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

class ProductDatabase extends Database{
    private String filename;
    private ArrayList<Record> products =  new ArrayList<Record>();
    private int count=0;
    
public ProductDatabase (String f){
    super(f);
  //products = new ArrayList<Product>();
}

public void setproduct(ArrayList<Record> update){
    products = update;
}

@Override
public Product createRecordFrom(String line){
        Scanner sc = new Scanner(line);
        sc.useDelimiter(",");
        String id = sc.next();
        String pn = sc.next();
        String mn = sc.next();
        String sn = sc.next();
        int q = sc.nextInt();
        float p = sc.nextFloat();        
        sc.close();
        Product U = new Product(id,pn,mn,sn,q,p);
        return U;
}
    
}
