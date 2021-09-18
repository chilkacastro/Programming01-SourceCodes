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

/**
 * Video 22
 * @author Chilka Castro
 */
public class LoopExercise2 {
    double num2; // not static and not final (camelcase)
    final double num1 = 1; // final but not static (camelcase)
    
    // a static main  method
    public static void main(String[] args) {
        double num = 5; // static but not final (camelcase)
        num = 6;
        num *= 2;
        System.out.println(num);
        final double FED_TAX_RATIO = 0.05; //  // final static var -> snakecase because it is inside a Static method so its final and static
                                        // normal var -> camelcase
                                        // non-static final var -> camelcase
                                        
        
        //if you don't want people touching it, you can put restriction by putting "FINAL"
//        fedTaxRatio = 0.08; nobody can change fedTaxRatio if you dont want it to be changed-> Java will show it as an error
//        fedTaxRatio *= 2;
        System.out.println(FED_TAX_RATIO);
        System.out.println(reverseString("hello"));
        System.out.println(reverseNum1(12345));
    }
    
    /**
     * To reverse a string by using a for loop
     * @param str the original string
     * @return  the string with the reversed order
     */
    public static String reverseString(String str) {
        String strOut = "";
        
        for (int i = str.length() - 1; i >= 0; i--) 
            strOut += str.charAt(i);
        
        return strOut;
    }
    
    /**
     * To reverse a number
     * @param num the original number e.g.: 12345
     * @return the reversed number : e.g. : 54321
     */
    public static int reverseNum1(int num) {
        //convert the num into a string
        String str = "" + num; // or do String.valueOf(num) -> it will also create a String "12345"
        
        // call the reverseString() to reverse it
        str = reverseString(str);
        //convert the string back to int
        return Integer.parseInt(str);   
    }
    
    /**
     * To reverse a number, you are not allowed to use anything related to String
     * @param num the original number e.g. : 12345
     * @return the reversed number: e.g. : 54321
     */
    public static int reverseNum2(int num) {
        int num2 = 0;
        
        // use while loop because you do not know how many iteration since it isnt a String
        while (num != 0) { // when you reach 0 its over 12345 -> 1234 -> 123 -> 12 -> 1 -> 0 (stop)
            int lastDigit = num % 10; // take the last digit
            num2 = num2 * 10 + lastDigit; // 5 -> 5 * 10 => 50 + 4 => 54 
            num /= 10; // will remove the last digit so the original number is becoming smaller           
        }
        return num2;
    }
}
