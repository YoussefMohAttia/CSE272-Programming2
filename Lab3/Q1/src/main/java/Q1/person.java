package Q1;

public class person {
    
    private String name;
    private double salary;
    private double default_salary = 1000;    
    private double monthly_expenses;
    private boolean is_working;
 
public person(String n)
{
 name = n;
 is_working = false;
 monthly_expenses = 0;
 salary = 0;
}

public person(String n,boolean w,double me,double s)
{
 if (w == true && s<=0)
      salary = default_salary;
 else if (w == false)
      salary = 0;
 else  
      salary = s;
 name = n;
 is_working = w;
 monthly_expenses = me;
}

public double net_income()
{
  return salary - monthly_expenses;
}

public String get_name()
{
  return name;  
}
public double get_salary()
{
  return salary;  
}
public boolean get_iswork()
{
  return is_working;  
}
public double get_monthexp()
{
  return monthly_expenses;  
}
public void set_name(String n)
{
  name = n;  
}
public void set_salary(double s)
{
  if(is_working == false)
      salary = 0;
  else if (s<0)
      salary = default_salary;
  else 
      salary = s;  
}
public void set_iswork(boolean w)
{
  if (w == true && salary<=0)
      salary = default_salary;
  if (w == false)
      salary = 0;
  is_working = w;  
}
public void set_monthexp(double me)
{
  monthly_expenses = me;  
}

    public static void main(String[] args) {
    person p1 = new person ("ali",true,100,500);    
    person p2 = new person ("ahmed");
    person p3 = new person ("youssef",true,500,0);
    person p4 = new person ("mohamed",false,500,-100);  
   
    System.out.println("First person Details: "); 
    System.out.println("name: "+p1.get_name());
    System.out.println("work state: "+p1.get_iswork());
    System.out.println("salary: "+p1.get_salary());    
    System.out.println("monthly exp: "+p1.get_monthexp());
    System.out.println("net income: "+p1.net_income());
    System.out.println("\r\n");
    
    System.out.println("Second person Details: "); 
    System.out.println("name: "+p2.get_name());
    System.out.println("work state: "+p2.get_iswork());
    System.out.println("salary: "+p2.get_salary());    
    System.out.println("monthly exp: "+p2.get_monthexp());
    System.out.println("net income: "+p2.net_income());
    System.out.println("\r\n");
    
    System.out.println("Third person Details: "); 
    System.out.println("name: "+p3.get_name());
    System.out.println("work state: "+p3.get_iswork());
    System.out.println("salary: "+p3.get_salary());    
    System.out.println("monthly exp: "+p3.get_monthexp());
    System.out.println("net income: "+p3.net_income());
    System.out.println("\r\n");

    System.out.println("Fourth person Details: "); 
    System.out.println("name: "+p4.get_name());
    System.out.println("work state: "+p4.get_iswork());
    System.out.println("salary: "+p4.get_salary());    
    System.out.println("monthly exp: "+p4.get_monthexp());
    System.out.println("net income: "+p4.net_income());
    System.out.println("\r\n");   
    
    p1.set_iswork(false);    
    p2.set_salary(1000);    
    System.out.println("First person Details: "); 
    System.out.println("name: "+p1.get_name());
    System.out.println("work state: "+p1.get_iswork());
    System.out.println("salary: "+p1.get_salary());    
    System.out.println("monthly exp: "+p1.get_monthexp());
    System.out.println("net income: "+p1.net_income());
    System.out.println("\r\n");
    System.out.println("Second person Details: "); 
    System.out.println("name: "+p2.get_name());
    System.out.println("work state: "+p2.get_iswork());
    System.out.println("salary: "+p2.get_salary());    
    System.out.println("monthly exp: "+p2.get_monthexp());
    System.out.println("net income: "+p2.net_income());
    System.out.println("\r\n");

}

}