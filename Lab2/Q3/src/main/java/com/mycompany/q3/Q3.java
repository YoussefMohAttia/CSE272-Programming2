package com.mycompany.q3;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accN;
        String n;
        double b;
        System.out.print("Enter account 1 data (account number,name,balance):");
        String credentials = sc.nextLine();
        Scanner scc = new Scanner(credentials);
        scc.useDelimiter(",");
        accN = scc.nextInt();
        n = scc.next();
        b = scc.nextDouble();
        scc.close();
        BankingAccount BA1 = new BankingAccount(accN,n,b);
        
        System.out.print("Enter account 2 data (account number,name,balance):");
        credentials = sc.nextLine();
        scc = new Scanner(credentials);
        scc.useDelimiter(",");
        accN = scc.nextInt();
        n = scc.next();
        b = scc.nextDouble();
        scc.close();
        BankingAccount BA2 = new BankingAccount(accN,n,b);
        BA1.Report();
System.out.println("The interest earned = "+BA1.calculateInterestEarned());
        BA2.Report();
System.out.println("The interest earned = "+BA2.calculateInterestEarned());

    }
}