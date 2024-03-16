package com.mycompany.q1;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Database {
    private ArrayList<Record> dataBase = new ArrayList<Record>();
    private String filename;
    private int count=0;
   
public Database (String f){
    filename = f;
}    

public void readFromFile(){
    try (Scanner scanner = new Scanner(Paths.get(filename))) {
    while (scanner.hasNextLine()) {
        String row = scanner.nextLine();
        dataBase.add(createRecordFrom(row));
        count++;
    }
}
    catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
} 
}

public abstract Record createRecordFrom(String line);

public  ArrayList<Record> returnAllRecords(){
  return dataBase; 
}

public Record getRecord(String key){
    int i;
    for(i=0;i<count;i++)
    {
     if(dataBase.get(i).getSearchKey().equals(key))
     {
       System.out.println(key+" is found."); 
       return dataBase.get(i);
     }  
    } 
    System.out.println(key+" is not found.");
    return null;
}

public void insertRecord(Record record){
    dataBase.add(count, record);
    count++;
}

public void deleteRecord(String key){
    int i;
    for(i=0;i<count;i++)
    {
     if(dataBase.get(i).getSearchKey().equals(key)){
        dataBase.remove(i);
        count--;
     }
    }
}

public boolean contains(String key){
    int i;
    for(i=0;i<count;i++)
    {
     if(dataBase.get(i).getSearchKey().equals(key))
     {
       System.out.println(key+" is found."); 
       return true;
     }  
    } 
    System.out.println(key+" is not found."); 
    return false;
}

public void saveToFile(){
    int i;
    try {
    BufferedWriter out = new BufferedWriter(
     new FileWriter(filename, false));
            for(i=0;i<dataBase.size();i++)
            {
            out.write(dataBase.get(i).lineRepresentation()+"\r\n");  
            }
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occurred" + e);
    }
}

 public int getcount(){
    return count;
}


}
