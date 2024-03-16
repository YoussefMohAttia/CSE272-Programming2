package backend;
import static constants.FileNames.EMPLOYEE_FILENAME;
public class AdminRole {
    private EmployeeUserDatabase eud;

public AdminRole(){
    eud = new EmployeeUserDatabase(EMPLOYEE_FILENAME);
    eud.readFromFile();
}

public void addEmployee(String ei, String n, String e, String a, String ph){
    eud.insertRecord(eud.createRecordFrom(ei+","+n+","+e+","+a+","+ph));
//    eud.saveToFile();
}

public EmployeeUser[] getListOfEmployees(){
    EmployeeUser[] eu = new EmployeeUser[eud.getcount()];
    eu = eud.returnAllRecords().toArray(eu);
    return eu;
}

public void removeEmployee(String key){
    eud.deleteRecord(key);
//    eud.saveToFile();
}

public void logout(){
    eud.saveToFile();
}

}