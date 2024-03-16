package com.mycompany.q3;

public class Rifle {
    private String name;
    private int damage;
    private int dps;
    private int speed;

  public Rifle(String n,int d,int s)
{
 name = n; 
 speed = s;
   if(d>=100 || d<=0)
  {
      System.out.print("\r\n");
      System.out.println("Invalid damage value!");  
      return;
  }   
 damage = d;
  dps = d*s;
}
  public void hit()
{
  System.out.println("HIT!");  
}
  public void print_data()
{
  System.out.print(name+", ");
  System.out.print(damage+", ");
  System.out.print(speed+", ");
  System.out.print(dps); 
}
  public String get_name()
{
  return name;  
}
public int get_damage()
{
  return damage;  
}
public int get_speed()
{
  return speed;  
} 
public int get_dps()
{
  return speed;  
} 
public void set_name(String n)
{
  name = n;  
}
public void set_damage(int d)
{
  if(d>=100 || d<=0)
  {
      System.out.println("Invalid damage value!! the damage value wont be updated.");  
      return;
  }
  dps = d*speed;
  damage = d;  
}
public void set_speed(int s)
{
  dps = damage*s;  
  speed = s;  
}

}
