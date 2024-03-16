package Q2;
import com.mycompany.q1.Database;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import com.mycompany.q1.Record;

public class CustomerProductDatabase extends Database{
    private String filename;
    private ArrayList<Record> records = new ArrayList<Record>();
    private int count=0;
    
public CustomerProductDatabase(String f){
    super(f);
    //records = new ArrayList<>();
}

public void setcustomerproduct(ArrayList<Record> update){
    records = update;
}

@Override
public CustomerProduct createRecordFrom(String line){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy",Locale.US);    
        Scanner sc = new Scanner(line);
        sc.useDelimiter(",");
        String ssn = sc.next();
        String id = sc.next();
        String date = sc.next();
        Scanner scdate = new Scanner(date);
        scdate.useDelimiter("-");  
        int d = scdate.nextInt();
        int m = scdate.nextInt();
        int y = scdate.nextInt(); 
        sc.close();
        scdate.close();
        CustomerProduct cp = new CustomerProduct(ssn,id,LocalDate.of(y, m, d));
        return cp;
}
      
}