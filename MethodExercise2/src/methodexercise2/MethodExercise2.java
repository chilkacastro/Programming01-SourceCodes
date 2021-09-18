/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodexercise2;

/**
 *
 * @author chilc
 */
public class MethodExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(median(4, 8, 0));
    }
    
    /**
     * To find the min value among the three
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number 
     * @return the min value among the three
     */
    public static double min(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
    
     /**
     * To find the max value among the three
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number 
     * @return the max value among the three
     */
    public static double max(double num1, double num2, double num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
    
    /**
     * To find the median value among the three
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the median value among the three
     */
    public static double median(double num1, double num2, double num3) {
        return num1 + num2 + num3 - min(num1, num2, num3) - max(num1, num2, num3);      // since you do not know the median -> you add num1 + num2 + num3 then 
                                                                                        // remove the minimum number by calling the min method (reuse the method above) and
                                                                                        // and by removing the maximum number by calling the max method (reuse the method above)
        /*
        1. num1 + num2 + num3 -> total 
        2. subtract the minimum value from the total of (num1 + num2 + num3) to eliminate the lowest number
        3. subtract the maximum value from the total of (num1 + num2 + num3) to eliminate the maximum number so you ended up with the middle value(median)
        */
        /*
        main ->
            println ->
                median ->
                    min ->
                        Math.min ->
                    min ->
                        Math.min ->
                    min ->
                median ->
                    max ->
                        Math.max ->
                    max ->
                        Math.max ->
                    max ->
                median ->
            print ln ->
        main 
        */
  
    }
}
