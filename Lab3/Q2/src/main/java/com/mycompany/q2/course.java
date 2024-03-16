package com.mycompany.q2;

public class course {
    private String name;
    private int credit_hours;
    private int id ;    
    private String lecturer;
    
 public course(String n,int ch,int i,String l)
{
 name = n;
 credit_hours = ch;
 id = i;
 lecturer = l;
}

 public String get_name()
{
  return name;  
}
public int get_credithours()
{
  return credit_hours;  
}
public int get_id()
{
  return id;  
}
public String get_lecturer()
{
  return lecturer;  
}
public void set_name(String n)
{
  name = n;  
}
public void set_credithours(int ch)
{
 credit_hours = ch;
}
public void set_id(int i)
{
 id = i;
}
public void set_lecturer(String l)
{
 lecturer = l;  
}
    
}
