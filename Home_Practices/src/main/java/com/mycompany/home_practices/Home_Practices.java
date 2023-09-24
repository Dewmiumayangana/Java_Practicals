/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.home_practices;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class Home_Practices {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        //Assign the array name
        int[] arr= new int[10];
        
        //Get user input values
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter your "+(i+1)+" value for the array: ");
            arr[i]=input.nextInt();
        }
        
        //Display the array
        System.out.println();
        System.out.println("Display the array values: ");
        for (int j= 0;j<10;j++) 
        {
            System.out.print(arr[j]+" ");
        }
        
        //Find the max value of the array
        int max=arr[0];
        for(int x=0;x<10;x++)
        {
            x++;
            if(max<arr[(x)])
            {
                max=arr[x];
            }
        }
        
        //Display the maximum value of the array
        System.out.println();
        System.out.println("Maximum value of the array is: "+max);
    }
}
