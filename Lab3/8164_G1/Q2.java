package com.mycompany.q2;

public class Q2 {

    public static void main(String[] args) {

    course c1 = new course ("Data structures",4,10,"Dr.Ahmed");
    course c2 = new course ("Electric circuits",3,20,"Dr.Yahia");
    course c3 = new course ("Digital Logic",2,30,"Dr.Ali");
    course c4 = new course ("Data structures II",4,40,"Dr.Mohamed");
    course c5 = new course ("Electric circuits II",3,50,"Dr.Youssef");
    course c6 = new course ("Digital Logic II",2,60,"Dr.Ali");
    course c7 = new course ("Digital Logic III",2,70,"Dr.Ali");
    student s1 = new student ("Youssef","011111111111");
    student s2 = new student ("Mohamed","0222222222");

    s1.enroll(c1);
    s1.enroll(c2);
    s1.enroll(c3);
    s1.enroll(c4);
    s1.enroll(c5);
    s1.enroll(c6);
    s1.enroll(c7);    
    s2.enroll(c1);
    s2.enroll(c2);    
    s2.enroll(c3);
    s2.enroll(c1);
    
    System.out.print("\r\n");    
    student.print_enrolledcourses(s1);
    System.out.print("\r\n");   
    student.print_credithours(s1);
    System.out.print("\r\n");       
    student.print_enrolledcourses(s2);
    System.out.print("\r\n");       
    student.print_credithours(s2);
    System.out.print("\r\n");      
    
    s1.print_lecturer("Dr.Ali");
    System.out.print("\r\n");   
    s1.print_lecturer("Dr.Ismail");

    }

}
