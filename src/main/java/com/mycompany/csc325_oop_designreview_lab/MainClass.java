/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        //Wrapped in try/catch block since Senior can throw InsufficienctCreditsException.
        try {
            //Added cast to short, since Human.age is a short. Alternative would be to change Human.age to int.
            Student std1 = new Student("James", (short) 20);

            //Cast to short. Changed to create new Freshman from new Student, since constructor call is taking in credits as an argument.
            //That is, now takes advantage of Inheritance using the newly created Freshman class.
            //Also changed to std2, since had same identifier as std1.
            Freshman std2 = new Freshman("James", (short) 20, 12); // name, age, credits

            //Added cast to short. Also changed to std3, since had to change Freshman to std2.
            Senior std3 = new Senior("John", (short) 30, 90);

            //Use a Scanner to get user input. Set GPA accordingly. In principle, should probably check that the GPA makes sense (e.g., is not negative), but...
            Scanner in = new Scanner(System.in);
            System.out.println("Enter GPA for James-the-generic-student:");
            std1.setGpa(in.nextDouble());

            System.out.println("Enter GPA for James-the-Freshman:");
            std2.setGpa(in.nextDouble());

            System.out.println("Enter GPA for John-the-Senior:");
            std3.setGpa(in.nextDouble());
            
            //Print the details of each student, including the entered GPAs.
            System.out.println(std1);

            System.out.println(std2);

            System.out.println(std3);

        } catch (InsufficientCreditsException e) {
            System.out.println(e);
        }

    }
}
