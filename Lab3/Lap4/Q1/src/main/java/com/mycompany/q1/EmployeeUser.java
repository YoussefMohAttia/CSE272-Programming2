package com.mycompany.q1;

public class EmployeeUser implements Record {
    private String employeeid;
    private String name;    
    private String email;
    private String address; 
    private String phonenumber; 
    
public EmployeeUser(String ei,String n,String e,String a,String ph)
{
 employeeid = ei;   
 name = n;
 email = e;
 address = a;
 phonenumber = ph;
}
 
@Override
public String lineRepresentation(){
  return employeeid+","+name+","+email+","+address+","+phonenumber;
}
@Override
public String getSearchKey(){
    return employeeid; 
}

public String getname(){
    return name; 
}
public String getemail(){
    return email; 
}
public String getaddress(){
    return address; 
}
public String getphnumber(){
    return phonenumber; 
}
     
}
