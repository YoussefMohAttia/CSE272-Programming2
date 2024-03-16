package com.mycompany.q4;
import  java.util.*;
/**
 *
 * @author ADMIN
 */
public class Q4 {
    
    public static void selectionSort(int [] array , int size){

    for (int j = 0; j < size - 1; j++) {
      int min_idx = j;
      for (int i = j + 1; i < size; i++) 
      {
        if (array[i] < array[min_idx]) 
          min_idx = i;
      }
      int temp = array[j];
      array[j] = array[min_idx];
      array[min_idx] = temp;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i =0 ; i<n ; i++)
        {
            System.out.print("Enter the "+ (i+1) +" element: ");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr , n);
        System.out.println("Sorted Array in Ascending Order: ");
        for(int i =0 ; i<n ; i++)
            System.out.println(arr[i]);
        }
}
