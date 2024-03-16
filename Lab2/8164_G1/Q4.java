package com.mycompany.q4;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;
/**
 *
 * @author ADMIN
 */
public class Q4 {
    public static void main(String[] args) {
    int i,maxindx = 0;
    BankingAccount BA [] = readBankingAccountDataFromFile("banking_accounts.txt"); 
    for(i=1;i<BA.length;i++)
    {
      if(BA[i].get_balance() > BA[maxindx].get_balance())
        maxindx = i;  
    }
    BA[maxindx].Report();
    System.out.print("Enter the new account data (account number,name,balance):");
    Scanner sc = new Scanner(System.in);
    String new_data = sc.nextLine();
    System.out.println(new_data);
    
            try {
            BufferedWriter out = new BufferedWriter(
                new FileWriter("banking_accounts.txt", true));
            out.write("\r\n"+new_data);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occurred" + e);
    }
    }
public static BankingAccount[] readBankingAccountDataFromFile(String fileName)
{
    int x ,i=0;
    //BankingAccount BA [] = new BankingAccount[5];
    try (Scanner scanner = new Scanner(Paths.get(fileName))) {
    x = scanner.nextInt();
    scanner.nextLine();
    BankingAccount BA [] = new BankingAccount[x];

    while (x>i) {
        String row = scanner.nextLine();

        Scanner scc = new Scanner(row);
        scc.useDelimiter(",");
        int accN = scc.nextInt();
        String n = scc.next();
        double b = scc.nextDouble();
        scc.close();
        BA[i] = new BankingAccount(accN,n,b);
        // we print the line that we read
        i++;
    }
            return BA;
}
    catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
   return null;
}
}