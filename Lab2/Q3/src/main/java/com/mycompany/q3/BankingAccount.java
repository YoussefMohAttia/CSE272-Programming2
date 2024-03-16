package com.mycompany.q3;
/**
 *
 * @author ADMIN
 */
public class BankingAccount {
    
    private int accountNumber;
    private String name;
    private double balance;
 
public BankingAccount(int accN, String n ,double b)
{
 accountNumber = accN;
 name = n;
 balance = b;
}

public void Report()
{
System.out.println("Account number: "+accountNumber);
System.out.println("Name: ");
System.out.println(name);
System.out.println("Balance: ");
System.out.println(balance);
//System.out.println("The interest earned = "+calculateInterestEarned());
}

public double calculateInterestEarned()
{
      if(balance >= 10000 )
          return balance*0.05;       
      else if(balance >= 5000 )
          return balance*0.03;
      else if(balance >= 1500 )
          return balance*0.02; 
      else if(balance >= 1000 )
          return balance*0.01; 
      else
          return balance*0.005;       
  }

public int get_accn()
{
  return accountNumber;  
}
public String get_name()
{
  return name;  
}
public double get_balance()
{
  return balance;  
}
public void set_accn(int accN)
{
  accountNumber = accN;  
}
public void set_name(String n)
{
  name = n;  
}
public void set_balance(double b)
{
  balance = b;  
}

}