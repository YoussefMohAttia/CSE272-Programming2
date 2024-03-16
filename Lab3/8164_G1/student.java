package com.mycompany.q2;

public class student {
    private String name;
    private String ph_number;    
    private course[] en_courses;
    private int course_count;  
    
 public student(String n,String ph)
{
 name = n;
 ph_number = ph;
 en_courses = new course [6];
}
 
 public void enroll(course c)
{
    int i;
 if(course_count == 6)
 {
     System.out.println("You have reached the maximum limit");
     return;
 }
 for(i=0;i<course_count;i++)
 {
  if(en_courses[i]==c)
  {
    System.out.println("You are already enrolled on this course"); 
    return;
  }
 }
 en_courses[course_count] = c;
 course_count++;  
}
 
 public static void print_enrolledcourses(student s1)
{
    int i,flag=0,flag2=0;
    for(i=0;i<s1.course_count;i++)
    {
        if(flag2==0)
       {
        flag2=1;   
        System.out.println("Courses enrolled by student "+s1.name+" are: ");   
       }
     flag=1;   
    System.out.print("course "+(i+1)+": "+s1.en_courses[i].get_name()+", ");
    System.out.print(s1.en_courses[i].get_credithours()+", "+s1.en_courses[i].get_id());
    System.out.print(", "+s1.en_courses[i].get_lecturer()+"\r\n");
    }  
    if(flag==0)
      System.out.println("No courses enrolled for this student");  
}
 
public static void print_credithours(student s1)
{
    int i;
    int sum=0;
    for(i=0;i<s1.course_count;i++)
    sum+=s1.en_courses[i].get_credithours();  
    System.out.println("Total Credit hours for student " +s1.name+ " is: " +sum);
} 

public void print_lecturer(String s)
{
    int i;
    int flag=0,flag2=0;
    for(i=0;i<course_count;i++)
    {
     if(en_courses[i].get_lecturer().equals(s))
     {
       if(flag2==0)
       {
        flag2=1;   
        System.out.println("Courses enrolled by student "+name+" for lecturer "+s+" are: ");   
       }
       flag++;  
       System.out.print("course "+(i+1)+": "+en_courses[i].get_name()+", ");
       System.out.print(en_courses[i].get_credithours()+", "+en_courses[i].get_id());
       System.out.print(", "+en_courses[i].get_lecturer()+"\r\n");
     }  
    } 
    if(flag==0)
    System.out.println("No courses for "+s+" are enrolled by student "+name);
} 

}
