package com.mycompany.q1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q1 {
    public static void checkEven(int number){

      int x ;
      int counter = 0;
      while(number > 0)
      {
      x = number % 10;   
      if(x % 2 == 0)
            counter++;
      number /= 10;
      }
      System.out.println("number of Even digits is :" + counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print(" Enter a positive number: ");
            n = sc.nextInt();
        }
        while(n < 0);
        checkEven(n);
    }
}
