/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_01;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Question_01 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //Get User Inputs
        System.out.print("Enter Your Name: ");
        String name=input.next();
        System.out.print("Enter Your Age: ");
        int age=input.nextInt();
        
        //Display the name and age
        System.out.println();
        System.out.println("Welcome "+name+" thoy you for join with us..");
        System.out.println();
        System.out.println("Now Let's see your voting ability.");
        System.out.println();
        
        //check the capable of voting
        if(age>18)
        {
            System.out.print("Congradulations!!! "+name+" You are capable for vatinng.");
        }
        else
        {
            System.out.println("Sorry!!! "+name+" You are not capable for votinng.");
        }
        System.out.println();
            
    }
}
