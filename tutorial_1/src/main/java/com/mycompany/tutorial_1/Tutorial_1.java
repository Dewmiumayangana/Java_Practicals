/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lec1;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Lec1 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        
        //Assign the two arrays
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arrCom = new int[10];
        int max=arrCom[0];
        int min=arrCom[0];
        
        //Get values for arrays
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter your " +(i+1)+" value for the first array: ");
            arr1[i]= input.nextInt();
        }
        
        System.out.println();
        
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter your " +(i+1)+" value for the second array: ");
            arr2[i]= input.nextInt();
        }
        
        //Display two arrays
        System.out.println();
        System.out.println();
        System.out.println("Display the array values");
        System.out.println();
        System.out.println("First array");
       
        for(int j=0; j<5; j++)
        {
            System.out.print(arr1[j]+"  ");
        }
        
        System.out.println();
        System.out.println("Second array");
        for(int j=0; j<5; j++)
        {
            System.out.print(arr2[j]+"  ");
        }
        
       //Display the combination of arrays
       System.out.println();
       System.out.println();
       
       for(int j=0; j<5; j++)
        {
           arrCom[j]=arr1[j];
           arrCom[j+5]=arr2[j];
        }
     
       System.out.println();
       System.out.println("Combined Array");
       for(int j=0; j<10; j++)
       {
           System.out.print(arrCom[j]+"  ");
       }
       
       //Find the max & min value of the array
       for(int j=0; j<10; j++)
       {
           if(max < arrCom[j])
           {
               max = arrCom[j];
           }
           else if(min < arrCom[j])
           {
               min = arrCom[j];
           }
       }
       
       //Display the min & max value
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("Max value is the array is: "+max);
       System.out.println();
       System.out.println("Min value is the array is: "+min);
      
    }  
}
