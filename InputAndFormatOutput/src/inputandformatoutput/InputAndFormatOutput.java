/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputandformatoutput;

import java.util.Scanner;

/**
 *
 * @author chilc
 */
public class InputAndFormatOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);                      // uppercase S -> user-defined so this is a class // new Scanner() -> this is a special method because Scanner is uppercase
       
 /*     // input an int and put it in a double (IT WORKS BUT IT WILL MAKE IT A DOUBLE)
        System.out.print("Please enter a number");
        double num2 = console.nextInt();             // Prints 3.0 because the int 3 is contained inside a double variable(which is more accurate)
*/        
        // input an int
        System.out.print("Please enter a year: ");
        int year = console.nextInt();
        
        int century = year / 100 + 1;
        int decade = year % 100 / 10 * 10;
        
        System.out.println("Year: "  + year);
        System.out.println("Century: "  + century);
        System.out.println("Decade:" + decade);
        
        System.out.printf("%-10s: %4d\n", "Year", year);                //%s for string, %d for int     \n for ending the line
        System.out.printf("%-10s: %4d\n", "Century", century);          //%s for string, %d for int     \n for ending the line
        System.out.printf("%-10s: %4d\n", "Decade", decade);            //%s for string, %d for int     \n for ending the line

        
//        // input a double
//        System.out.print("Please enter a number: ");
//        double num = console.nextDouble();
//        System.out.println(num);

//        System.out.println(num2);
//        System.out.println(year);
//
//        System.out.println("Please enter your gender: ");
//        System.out.println("1. male");
//        System.out.println("2. female");
//        System.out.println("3. would rather not to say");
//        String gender = console.next();
//        System.out.println(gender);
    
    /* nextInt vs next
    nextInt  123  + 1 = 124
    next    "123 is a number!!!!"
    */
        
//        // String input example
//        System.out.println("Please enter your favorite tv show: ");
//        String str = console.next();        // the end of the input is "enter", or "space"   
//        System.out.println(str);            // if you put on console game of throne -> it will only store/print "game"
//        
        // Another String input example
//        System.out.println("Please enter your first name: ");
//        String fname = console.next();
//        System.out.println("Please enter your last name: ");
//        String lname = console.next();
        
//                // OR just do
//        System.out.println("Please enter your full name: ");        
//        String fname = console.next();
//        String lname = console.next();
//        
//        System.out.println(fname);
//        System.out.println(lname);
//        
//        // input a String
//        System.out.println("Please enter your favorite tv show: ");
//        String str  = console.nextLine();                        // enter as end
//        System.out.println(str);
//
//        System.out.println("Please enter 4 words:");
//        String word1 = console.next();                 // space and enter as end same thing with nextInt and nextDouble
//        String word2 = console.next();
//        String word3 = console.next();
//        String word4 = console.next();
//   
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//        System.out.println(word4);
//
//        System.out.println("Please enter two numbers:");
//        double num1 = console.nextDouble();         // console.nextDouble() -> reads what you put on the console so it can be stored
//        double num2 = console.nextDouble();
//        
//        System.out.println(num1 + num2);        // you can add them 
//        
//        // if formula is written (NOT THE GOOD WAY)
//                        // 3.0 + "+"  -> "3.0" + "+" -> "3.0+"     
//        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));    // what will happen here is that java will bring whatever into a string
//                                                                        // two string +, java will join them
//                                                                        
//        System.out.printf("%5.2f / %.2f = %.3f", num1, num2, (num1 / num2));   // globally what you want to see
    }
    
}
