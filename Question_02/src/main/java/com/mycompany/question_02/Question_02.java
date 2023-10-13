/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_02;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Question_02 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //Get the arrays length from user
        System.out.print("Enter the length of array:");
        int length=input.nextInt();
        
        //get values for the array 1
        int[]MyArr1=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter a number: ");
            MyArr1[i]=input.nextInt();
        }
        
        //get values for the array 2
        int[]MyArr2=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter a number: ");
            MyArr2[i]=input.nextInt();
        }
        
        System.out.print("");
        
        // Calculate the scalar product
        int scalarProduct = 0;
        for (int i = 0; i < length; i++) {
            scalarProduct += MyArr1[i] * MyArr2[i];
        }

        System.out.println("Scalar product of the two arrays: " + scalarProduct);

        
    

    }
}
