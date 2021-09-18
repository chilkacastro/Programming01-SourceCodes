package basicinputoutputcalculationhandson;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chilc
 */
public class FutureSalary {
    /*
    ask the user the initial salary         e.g.: 3500
    ask the user the increase ratio         e.g.: 0.02
    ask the user after how many year the salary she/he want to check    e.g.: 6
    
    Initial salary             :     3500.00
    Annually increase ratio    :        0.02
    After X years              :           6
    ----------------------------------------
    Salary after 6 years       :     xxxx.xx
    */
    public static void main(String[] args) {
        // input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the initial salary: ");
        double initSalary = console.nextDouble();
        System.out.print("Please enter the annual increase ratio: ");
        double annualIncreaseRatio = console.nextDouble();
        System.out.print("Please enter the number of years: ");
        int year = console.nextInt();
        
        // calculation
        double futureSalary = initSalary * Math.pow((1 + annualIncreaseRatio), year);

        // output
        System.out.printf("%-30s:%8.2f\n", "Initial salary", initSalary);
        System.out.printf("%-30s:%8.2f\n", "Annual incease ratio", annualIncreaseRatio);
        System.out.printf("%-30s:%8d\n", "After X years", year);
        System.out.println("-----------------------------------------");
        System.out.printf("%-30s:%8.2f\n", String.format("After %d years", year), futureSalary);
        
    }
}
