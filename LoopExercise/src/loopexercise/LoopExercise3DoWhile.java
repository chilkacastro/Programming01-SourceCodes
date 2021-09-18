/*
 * The MIT License
 *
 * Copyright 2021 Chilka Castro .
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package loopexercise;

import java.util.Scanner;

/**
 * Exercise with dowhile-> video 23
 * @author Chilka Castro
 */
public class LoopExercise3DoWhile {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer;
        
        do {
        // First get the two numbers you want to calculate
        double[] nums = inputNums();
        // Second get the operator
        char oper = inputOper();
        // Third calculate the result
        double result = calcResult(nums[0], nums[1], oper);
        // Last send them to a method that will print them all
        printResult(nums[0], nums[1], oper, result);      
        
        // Ask user if he/she wants to do it again
        System.out.println("Do you want to do another calculation");            // keyword do another transaction -> do while
        answer = console.next();
        } while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));  // when answer is yes or y IS TRUE then keep doing it
        
        System.out.println("Thank you, bye~~~~");
    }
    
    /**
     * To ask the user to input two numbers
     * @return the two numbers user input
     */
    public static double[] inputNums() {
        Scanner console = new Scanner(System.in);
        double[] nums = new double[2];      //[0, 0] -> default value inside
        System.out.print("Please enter two numbers, separated by space: ");
        nums[0] = console.nextDouble();
        nums[1] = console.nextDouble();
        
        return nums;
    }
    
    /*
    - You want people to re-enter it again when it is not the input you want. 
    so, a LOOP is needed so that it can be repeated.
    Ask yourself? What kind of loop do I need? How many times would it iterate? 
    will it take one time, 3 times? or it will iterate depending on what the user want
    - If you don't know how many iteration, you got to WHILE Branch
    - Then now ask yourself, what condition or when do you want to repeat? When user input something bad
    */
    
    /*
    Do While : do it first then check condition
    - Is a special kind of while
    */
    
    /**
     * To ask the user to input an operator, only supports +,-, *, x, X, /
     * @return the operator user input
     * 
     */
    public static char inputOper() {
        Scanner console = new Scanner(System.in);   // people can input something crazy here
        char oper;
        
        do {  // the body will atleast be executed for 1 time
            System.out.print("Please enter an operator: ");
            oper = console.next().charAt(0);
        } while(!isOperValid(oper));  // while oper is not valid (false) keep doing the body | is it TRUE that it it is still not valid ? THEN DO BODY AGAIN
        
        return oper;
    }
    
    /*
    WHY ORDINARY WHILE WOULDNT WORK IN THIS SITUATION?
    public static char inputOper() {
        Scanner console = new Scanner(System.in);   // people can input something crazy here
        
        // cant be just like this because there is not input oper YET to be checked just atleast once!
        while(!isOperValid(oper)) { // while oper is not valid (false) keep doing the body
            System.out.print("Please enter an operator: ");
            char oper = console.next().charAt(0);
        }
        
        return oper;
    }
    */
    
    /**
     * To check if an operator is valid, only supports +, -, *, x, X, /
     * @param oper an operator
     * @return if an operator is +, -, *, x, X, /
     */
    public static boolean isOperValid(char oper) {
        String validOper = "+-*xX";
        return validOper.contains("" + oper);
    }
    
    /**
     * To calculate the result of a formula
     * @param num1 the first number
     * @param num2 the second number
     * @param oper the operator of the operation
     * @return the result of the calculation
     */
    public static double calcResult(double num1, double num2, char oper) {
        switch (oper) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
            case 'x':
            case 'X':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                return modulo(num1, num2);
         }
    }
    
    /**
     * To print a formatted result of the calculation
     * @param num1 the first number
     * @param num2 the second number
     * @param oper the operator
     * @param result the result
     */
    public static void printResult(double num1, double num2, char oper, double result) {
        System.out.printf("%.2f %c %.2f = %5.2f\n", num1, oper, num2, result); // 1 + 2 = 3  
    }

    /**
     * To add two numbers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of two number
     */
    public static double add(double num1, double num2) {
        return num1 + num2;

    }

    /**
     * To subtract two numbers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the difference of two number
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * To multiply two numbers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of two number
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * To divide two numbers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the quotient of two number
     */
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    
    /**
     * To mod two numbers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the remainder of the mod of two numbers
     */
    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }
}
