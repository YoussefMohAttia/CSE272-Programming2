package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {
    int i;    
    EmployeeUserDatabase eud = new EmployeeUserDatabase("Employees.txt");
    eud.readFromFile();
    eud.returnAllRecords();
    eud.contains("E1200");
    eud.contains("E1000");
    Record eu = eud.getRecord("E1200");
    System.out.print(eu.lineRepresentation()+"\r\n");
    eud.getRecord("E1000"); 
    eud.deleteRecord("E1201");
    EmployeeUser eu2 = new EmployeeUser("E1206","Yahia","yahia_1999@gmail.com","Ismailia","01000000006");
    eud.insertRecord(eu2);
    System.out.print(eud.getcount()+"\r\n");
    eud.saveToFile();
    
    AdminRole ar = new AdminRole();
    ar.addEmployee("E1207","Yahia","yahia_1999@gmail.com","Ismailia","01000000007");
    ar.removeEmployee("E1202");
    EmployeeUser[] eu3;
    eu3 = ar.getListOfEmployees();
    for(i=0;i<eu3.length;i++)
    {
     System.out.print(eu3[i].lineRepresentation()+"\r\n");
    }

}            
}
