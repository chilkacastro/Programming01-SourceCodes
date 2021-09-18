/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodexercise;

import java.util.Scanner;

/**
 *
 * @author chilc
 */
public class MethodExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        // main is the entrace of your oode
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = console.nextInt(); // input 1
        int num2 = console.nextInt(); // input 5
        System.out.println(num1);       // still will be 1 because it is only in this world
        
        int sum = sum(num1, num2);
        int sum2 = sum(1, 2);               // sent to the method as 1 and 2 and goes back as int sum2 = 3; -> goes back to the other world as 3
        System.out.println(sum);            
//        System.out.println(num1);         // error because num1 doesn't exist in this world

        // input
//      Scanner console = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = console.nextInt();
        
        int century = calcDecade(year);
        int decade = calcCentury(year);
        
        System.out.printf("%-10s: %d\n", "Year", year);
        System.out.printf("%-10s: %d\n", "Century", century);
        System.out.printf("%-10s: %d\n", "Decade", decade);
        
        
        // input
        System.out.print("Please enter the menu price: ");
        double menuPrice = console.nextDouble();
        
        System.out.print("How much percentage of tips do you want to pay: ");
        double tipRatio = console.nextDouble() / 100;                           // tip ratio should be 0.15, you always divide it to 100 -> do this for calculation purpose
        
        // processing
        double finalPrice = calcFinalPrice(menuPrice, tipRatio);
        
        System.out.printf("%-15s: %.2f\n", "Menu Price", menuPrice);
        System.out.printf("%-15s: %.2f%%\n", "Tip Ratio", tipRatio * 100);      // bring back to tip percentage for printing it--> just to show that it is 15.00 % -> * 100 for printing purpose // %% to print a percentage sign
        System.out.printf("%-15s: %.2f\n", "Final Price Price", finalPrice);
        
        System.out.println(sum(1, 2));          // FIRST METHOD IS CALLED because 1, 2 are both int numbers so they match the first sum method
        System.out.println(sum(1.2, 2.3));      // 2ND METHOD IS CALLED because both numbers are double
        System.out.println(sum(1.2, 2));        // 2ND METHOD IS CALLED because 1.2 is a double
        System.out.println(sum(1, 2, 3));
        
        /* OVELOAD METHODS
        In the same class, if you have more than one methods that have the 
        same method name, but different parameter list (different number of 
        parameters, different types of parameters) this is called overload methods
        */
        
    }
    
    /**
     * To calculate the sum of two integer numbers
     * @param num1 the first integer number to add
     * @param num2 the second integer number to add
     * @return the sum of the two integer numbers
     */
    public static int sum(int num1, int num2) {             // header   // assume you know the value
       int sum = num1 + num2;          // by assuming the value, you can calculate the value and then return the sum
       num1++;  // 2
       num2++;  // 6
       return sum;
 //       return num1 + num2;     // you can also do this directly instead of making a variable for the sum   // everything in the method will be destroyed when the method is finished
                                // when you return something, that will kill a method
    }
    
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /*
    METHODS:
    1. find the century of a year
    2. calculate the final price of a meal, with tips
    3. check if a password is strong enough or not
    */
    public static int calcCentury(int year) {               // header
        return year / 100 + 1;
    }
    
    /**
     * To calculate the decade of a year
     * @param year the input year
     * @return the decade of a year
     */
    public static int calcDecade(int year) {
        return year % 100 / 10 * 10;
    }
    
    /*
    default menuprice that already has tips added to price
    */
    public static double calcFinalPrice(double menuPrice) {
        return menuPrice;
    }
    /**
     * To calculate the final price of a meal, including tips
     * @param menuPrice the price of food on the menu
     * @param tipRatio the ratio of tips the customer wants to pay
     * @return the total price of a meal including tips
     */
    public static double calcFinalPrice(double menuPrice, double tipRatio) {
        /*
        1. calculare the fed Tax        // 5%
        2. calculare the QC tax         // 9.975%
        3. calculate tips (based on the price with tax)
        4. calculate the final price that includes everything
        */
        
        double fedTaxRatio = 0.05;
        double provTaxRatio = 0.09975;
        
        double fedTax = menuPrice * fedTaxRatio;
        double provTax = menuPrice * provTaxRatio;
        
        double tips = (menuPrice + fedTax + provTax) * tipRatio;
        return menuPrice + fedTax + provTax + tips;

        // return menuPrice * (1 + tipRatio) ;    // same as -> menuPrice + menuPrice * tipRatio;      // return will kill a method
        /* longer way if you want (way 3)
        double tips = menuPrice * tipRatio;
        return menuPrice + tips;
        */
    }
    
    /**
     * To check if a password is strong enough
     * @param pw the password the user input
     * @return true or false
     */
    public static boolean isPasswordStrong(String pw) {
        return true;    // we cannot implement this method right now
    }
    
    
    
}
