package com.mycompany.q1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q1 {
    public static void checkPerfectSquare(int number){
    int i;
    System.out.println("The perfect square numbers between 1 and " +number+":");
    for(i=1 ; i<=number ; i++)
    {  
      if(Math.pow((int)Math.sqrt(i),2) == i) 
          System.out.print(i+" ");
    }       
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print(" Enter a positive number: ");
            n = sc.nextInt();
        }
        while(n <= 0);
        checkPerfectSquare(n);
    }
}