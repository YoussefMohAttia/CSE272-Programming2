package com.mycompany.q2;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,e;
        System.out.print("Please enter the start of the first range: ");
        s = sc.nextInt();
        System.out.print("Please enter the end of the first range: ");
        e = sc.nextInt();   
        Range range1 = new Range(s,e);
        System.out.print("Please enter the start of the second range: ");
        s = sc.nextInt();
        System.out.print("Please enter the end of the second range: ");
        e = sc.nextInt();   
        Range range2 = new Range(s,e);
        Range range3 = Range.intersection(range1, range2); 
        if (range3==null) System.exit(0);
        System.out.println("The intersection of the two ranges is ["+range3.get_s()+","+range3.get_e()+"]");
        System.out.print("The intersection contains zero? ");
        System.out.print(range3.contains(0));
    }
}