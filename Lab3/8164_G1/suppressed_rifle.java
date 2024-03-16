package com.mycompany.q3;

public class suppressed_rifle extends Rifle{
    
    private String suppressor_brand;

  public suppressed_rifle(String n,int d,int s,String sn)
{  
 super(n,d,s);   
 suppressor_brand = sn;
}
  @Override
  public void hit()
{
  System.out.println("SUPPRESSED HIT!");  
}
  public void increase_damage()
{
  int x = get_damage();
  set_damage(x+1);
}
  @Override  
  public void print_data()
{
  super.print_data();
  System.out.print(", "+suppressor_brand); 
}
  
}

