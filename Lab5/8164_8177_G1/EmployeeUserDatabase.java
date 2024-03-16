package backend;
import backend.Database;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

class EmployeeUserDatabase extends Database {    
    private String filename;
    private ArrayList<Record> users ;
    private int count=0;
    
public EmployeeUserDatabase(String f){
    super(f);
    users = new ArrayList<>();
}

@Override 
public EmployeeUser createRecordFrom(String line){
        Scanner sc = new Scanner(line);
        sc.useDelimiter(",");
        String ei = sc.next();
        String n = sc.next();
        String e = sc.next();
        String a = sc.next();
        String ph = sc.next();
        sc.close();
        EmployeeUser U = new EmployeeUser(ei,n,e,a,ph);
        return U;
}

}
