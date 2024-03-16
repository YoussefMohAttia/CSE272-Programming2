
package com.mycompany.q3;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q3 {

public static void checkPalindrome(String str) 
    {     
        int front = 0; 
        int rear = str.length()-1;  
        str = str.toLowerCase(); 
        while(front <= rear) 
        {              
            char f = str.charAt(front); 
            char r = str.charAt(rear); 
            if (f < 'a' || f > 'z') 
                front++; 
               
            else if(r < 'a' || r > 'z')
                rear--; 

            else if( f == r) 
            { 
                front++;
                rear--; 
            } 
            else
            {
                System.out.println("Sentence is not palindrome");
                return;
            }
        }          
        System.out.println("Sentence is palindrome");     
    } 
      
    // Driver program to test sentencePallindrome() 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter statement: "); 
        String str = sc.nextLine();
        checkPalindrome(str);
    } 
} 
