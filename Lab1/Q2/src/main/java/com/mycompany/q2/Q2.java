package com.mycompany.q2;
/**
 *
 * @author ADMIN
 */
public class Q2 {
    
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Ahmed";
        employee1.phonenumber = "01234578945";
        employee1.address = "Alexandria";
        employee1.salary = (float) 3501.50;
        Employee employee2 = new Employee();
        employee2.name = "Ali";
        employee2.phonenumber = "01257577923";
        employee2.address = "Cairo";
        employee2.salary = 4709.5f;
        System.out.println("First Employee info : " +" "+ employee1.name +" "+ employee1.phonenumber +" "+ employee1.address +" "+ employee1.salary );
        System.out.println("Second Employee info : " +" "+ employee2.name +" "+ employee2.phonenumber +" "+ employee2.address +" "+ employee2.salary );
}
}