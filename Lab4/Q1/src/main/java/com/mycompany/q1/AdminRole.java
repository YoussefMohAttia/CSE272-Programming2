package com.mycompany.q1;

public class AdminRole {
    private EmployeeUserDatabase eud;

public AdminRole(){
    eud = new EmployeeUserDatabase("Employees.txt");
    eud.readFromFile();
}

public void addEmployee(String ei, String n, String e, String a, String ph){
    eud.insertRecord(eud.createRecordFrom(ei+","+n+","+e+","+a+","+ph));
    eud.saveToFile();
}

public EmployeeUser[] getListOfEmployees(){
    EmployeeUser[] eu = new EmployeeUser[eud.getcount()];
    eu = eud.returnAllRecords().toArray(eu);
    return eu;
}

public void removeEmployee(String key){
    eud.deleteRecord(key);
    eud.saveToFile();
}

public void logout(){
    eud.saveToFile();
}

}