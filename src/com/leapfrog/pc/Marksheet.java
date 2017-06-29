/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pc;

import com.leapfrog.pc.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Marksheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the marks of Science");
            double Sci = input.nextDouble();

            System.out.println("Enter the marks of Maths");
            double Math = input.nextDouble();

            System.out.println("Enter the marks of Computer");
            double Comp = input.nextDouble();

            System.out.println("Your total marks is " + calc.getTotal(Sci, Math, Comp));

            if (Sci < 40 || Math < 40 || Comp < 40) {
                System.out.println("You are failed");
            } else {
                System.out.println("You are passed");
                System.out.println("Your Percentage is " + calc.getPercentage(Sci, Math, Comp));
                double Percentage = (Sci + Math + Comp) / 3;
                if (Percentage >= 80) {
                    System.out.println("You are passed with Distinction");
                } else if (Percentage >= 60) {
                    System.out.println("You are passed with First Division");
                } else if (Percentage >= 50) {
                    System.out.println("You are passed with Second Division");
                } else if (Percentage >= 40) {
                    System.out.println("You are passed with Third Division");
                }
            }
            System.out.println("Do you want to continue with more marksheets[Y/N]");
            String ch = input.next();

            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);

            }
        }//end while

    }
}
