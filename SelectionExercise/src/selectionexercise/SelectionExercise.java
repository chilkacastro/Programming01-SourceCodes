/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercise;

import java.util.Scanner;

/**
 *
 * @author chilc
 */
public class SelectionExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calcFinalPrice(3, true));    // w/ discount
        System.out.println(calcFinalPrice(3, false));   // w/o discount
        
        Scanner console = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        int age = console.nextInt();
//        System.out.printf("%-10s: $%.2f\n", "Price", calcTicketPrice(age));
    }
    
    /**
     * To calculate the ticket price for a person, based on its age
     * @param age the age of the person
     * @return the ticket price for that person
     */
    public static double calcTicketPrice(int age) {     // age = 25
        /*
        free if you are younger than 18
        2$ if you are older or equal than 65
        5$ for all others
        */
        //double price;
        
        if (age < 18) 
            //System.out.println("Hey, you are very young!");
            return 0;               // one statement for this branch so don't put a bracket
            //price = 0;
    
        else if (age >= 65)                                                  //  else if (age++ >= 65) age becomes 26 even if this statement is false--> because you checked the condition so it still updated the age to 26
            //System.out.println("Thank you for making our society better");
            return 2;
            //price = 2;
        
        else 
            //System.out.println("You are at your golden age!!!! ");
            return 5;
           //price = 5;
    }
    
    /**
     * TO check if a number is even or not
     * @param num the number you want to check
     * @return true if the number is even, false if it is odd
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;                // this is an example of --> return condition;
    /*    if (num % 2 == 0) 
            return true;
                            // hidden else here
        return false;
        
    -------------SAME THING AS---------------
        
        if (num % 2 == 0) 
            return true;
        
        else
            return false; 

    */
        
    }
    /*
    if (condition)
        return true;
    else 
        return false
    
    => return condition;            // one line only
    */
    
    /**
     * To calculate the letter score of a digit score
     * @param digitScore the digit score of 
     * @return the letter score of the digit score
     * [90, 100] A 
     * [80, 90] B 
     * [70, 80] C 
     * [60, 70] D 
     * [0, 60) F 
     */
    public static char calcLetterScore(double digitScore) {
        if (digitScore >= 90 && digitScore <= 100)
            return 'A';
        if (digitScore >= 80) 
            return 'B';
        if (digitScore >= 70) 
            return 'C';
        if (digitScore >= 60) 
            return 'D';
        else                                     // (digitScore < 60)  change it to else because if all of them are if (condition) Java doesnt like it that it is possible that those situations wouldn't be activated so to fix it use else
            return 'F';
    }
    
    /**
     * To generate a title of a person based on its gender
     * @param gender the gender of a person 
     * @param age the age of the same person
     * @return the title (boy, girl, man, woman) of a person
     */
    public static String getTitle(char gender, int age) {
        // COMPLICATED --> return (gender == 'f') ? (age < 18) ? "girl" : "woman" : (age < 18) ? "boy" : "man";
          
        if (gender == 'f')
            return (age < 18) ? "girl" : "woman";
        else 
            return (age < 18) ? "boy"   : "man";
        
        
        /* if (gender == 'f') 
            if (age < 18)           // start: still considered as one statement -> whole if/else
                return "girl";

            else 
                return "woman";     // end
        else 
            if (age < 18) 
                return "boy";
            else 
                return "man"; */
    }
    
    /**
     * To calculate the future salary of an employee, if you work less than 
     * 5 years, every year your salary increases by 2%, if you work equal to
     * or more than 5 years, then every year your salary increases by 5%.
     * @param initSalary the initial salary the employee has
     * @param year the salary after how many years
     * @return the future salary the employee will have after that many years
     */
    public static double calcFutureSalary(double initSalary, double year) {
        if (year < 5)
            return initSalary * Math.pow(1 + 0.02, year);
        else 
            return initSalary * Math.pow(1 + 0.02, year) * Math.pow(1 + 0.05, year - 5);
    }
    
    /**
     * To calculate how much a client has to pay for the TV company
     * @param channelNum how many channels the clients wants to book
     * @param vip if the client is a VIP or not
     * @return the final price the client has to pay
     * 
     * each channel takes $10, if you book less or equal than 5 channels
     * each additional channel takes $6, if a client books more than 5 channels
     * each additional channel takes $2, if a client books more than 10 channels
     *
     * if you are a VIP, you will have a 15% off for the final price
     */
    public static double calcFinalPrice(int channelNum, boolean vip) {
        int threshold1 = 5;     // less than 5 years
        int threshold2 = 10;    // less than 10 years
        
        double channelPriceLessThanThreshold1 = 10;
        double channelPriceLessThanThreshold2 = 6;
        double channelPriceMoreThanThreshold1 = 2;
        
        double discountRatio = 0.15;
        
        double price;
        
        if (channelNum <= threshold1)    // x <= 5
            price = channelNum * channelPriceLessThanThreshold1;   // price = x * 10;
        
        else if (channelNum > threshold1 && channelNum <= threshold2)   // x > 5 && x <= 10  (6,10) 
            price = threshold1 * channelPriceLessThanThreshold1 +       // price = x * 10 + 
                    (channelNum - threshold1) * channelPriceLessThanThreshold2;     // (x - 5) * 6      -> removing the channelNum that you used already e.g. 8 channels - 5 channels = 3 channels * 6 $ 
        
        else        // e.g. 14 channels   1-5 channels goes to branch1          |   10 - 5 = 5  -> [6-10] channels goes to branch2                  |  14 - 10 = 4    [11 - 14] goes to branch3 
            price = threshold1 * channelPriceLessThanThreshold1 + 
                    (threshold2 - threshold1) * channelPriceLessThanThreshold2 + 
                    (channelNum - threshold2) * channelPriceMoreThanThreshold1;
                    
        return (vip) ? price * (1 - discountRatio) : price;
        /*
        if (vip)
            return price * (1 - discountRatio)
        else 
            return price;
        */
    }
    
    public static void giveReward(char letterScore) {   
        switch (letterScore) {          // only compare using == 
            case 'A' :                  // means is letterScore == 'A'
            case 'a' :                  // if letterScore is == to small 'a'
                System.out.println("$100"); // they are sharing this statement
                break;           // like return so everything is not printed-it will stop printing the following codes
            case 'B': 
            case 'b':
                System.out.println("A new backbag");
                break;
            case 'C':
            case 'c':
                System.out.println("A notebook");
                break;
            case 'D':
            case 'd':
                System.out.println("A pencil");
                break;
            default: 
                System.out.println("Free hug");         // no break here because it is default already 
                
        }
    }
    
    /**
     * A simple calculator, that calculate something based on the input
     * @param num1 the first number
     * @param num2 the second number
     * @param oper the operator, could be + - * (Xx) /
     * @return the result of the calculation
     */
    public static double calcResult(double num1, double num2, char oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':                   // always return a positive result, NOT allowed to use Math.abs()
                return (num1 < num2) ? num2 - num1 : num1 - num2;           
            case '*':
            case 'X':
            case 'x':
                return num1 * num2;
            default:
                return num1 / num2;
             
        }
        
    }
    /**
     * A fake ATM
     * @param oper the operation the user want to have:
     * 1. withdraw
     * 2. deposit
     * 3. display balance
     * 
     * if user select 1 or 2, then ask the user the amount
     * if select 1, check the balance first, if the balance is greater, then update the balance
     * and print "withdraw success, your current balance is $xxx"
     * else tell the user "withdraw failed, you want to withdraw $200, but you only have $100
     * if select 2, then update the balance and print "withdraw success, your current balance is $xxx"
     * 
     * if select 3, then directly print "your current balance is $xxx"
     * @param balance the current balance of the user
     */
    public static void fakeATM(int oper, double balance) {
        Scanner console = new Scanner(System.in);
        double amount;
        
        switch (oper) {
            case 1:     // withdraw
                System.out.print("How much do you want to withdraw? ");
                amount = console.nextDouble();
                
                if (balance >= amount) {            // to check if the person has enough money to be withdrawn
                    balance -= amount;
                    System.out.printf("withdraw success, your current balance is $%.2f/n", balance);
                   
                }
                else
                    System.out.printf("withdraw failed, you want to withdraw $%.2f,"
                            + " but you only have $%.2f/n", amount, balance);
            case 2:     // deposit
                System.out.print("How much do you want to deposit? ");
                amount = console.nextDouble();
                balance += amount;
                System.out.printf("deposit success your current balance is "
                        + "$%.2f\n", balance);
                break;

            default:
                System.out.printf("your current balance is $%.2f\n", balance);
                
        }
    }    
    
}
    /* DON'T DO THIS 
    if (vip == true) because if (vip) <- is already true (hidden)
    */

// ------------------------------------------------------------------------
    /*
    1000   * 1.02                             8
    1   1000 * 1.02
    2   1000 * 1.02 * 1.02
    3   1000 * 1.02 * 1.02 * 1.02
    4   1000 * 1.02 * 1.02 * 1.02 * 1.02
    5   1000 * 1.02 * 1.02 * 1.02 * 1.02 * 1.02    
    
    
    
    */

//--------------------------------------------------------------------------
/*
    Conditional operator, which is the only operator that takes three values c
    condition(boolean) ? a : b

    if (condition)
        return a;
    else
        return b;   => return condition ? a : b


    if (condition)
        var = a;
    else
        var = b;    => var = condition ? a : b;

*/

//----------------------------------------------------------------------

/*
Goal 
    1. correct, your code must work, in whatever situation, robusty
    2. efficient
    3. clarity
    4. length
*/
