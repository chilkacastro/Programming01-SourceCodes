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
package randomexercise;

import java.util.Random;

/**
 *
 * @author Chilka Castro
 */
public class RandomExercise {
  
    /*
    Random:
        - there is no real randomness in any programming language.
    When we see something random, they are not real random numbers, all of them
    are calculated with a specific formula f(x).   0 -> 3415 0-> 3415
    3 -> 41578
    
    the random in programming is predictable
    
    the input x is called the seed, if y ou put the same seed to the formula,
    the "random" number that calculated out should be the same.
    
    so we always want to change the seed when we generate random numbers.
    Java will use the current system time in sec as the seed, and then use the 
    first "random" number as the seed to generate the second number, then use 
    the second "random" number to generate the third number
    
    a.) Math.random() -> [0, 1) -> 0 included and 1 excluded
    b.) Random rand = new Random()
        int num = rand.nextInt(5) -> [0, 5) --> {0, 1, 2, 3, 4}    
    
    
        // Generate a dice [1, 6]
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1; // -> [1, 7)
        int dice2 = (int) Math.random() * 6 + 1 -> [0, 6) + 1 -> [1, 7)  //     First thing wil be Math.random() * 6 then cast it to (int) then plus 1
    
        generate numbers[7, 10] -> 7,8,9,19 ->4 numbers
        int num = rand.nextInt(4) + 7   // [0,4) -> [7, 11)
        int num2 = (int) Math.random * 4 + 7; 
    
        rand.nextInt(amount) + min
        (int) Math.random() * amount + min
    
        generate numbers {7, 10, 13, 16, 19}
        int num = rand.nextInt(5) * 3 + 7               {0 1 2 3 4} -> {0 3 6 9 12} -> {7 10 13 16 19}
        int num2 = (int) Math.random() * amount * stepLen + min
        
        general : rand.nextInt(amount) * stepLen + min
            
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Math.random());

    }
    
    /**
     * Delete a random character from the string
     * @param str the input string
     * @return the new String after you delete a random character "ello", "hell", "helo"
     */
    public static String randomDelete(String str) {
        Random rand = new Random();
        int idx = rand.nextInt(str.length());
        return str.substring(0, idx) + str.substring(idx + 1);
    } 
    
    /**
     * Delete certain amount of random character from the string
     * @param str the input string "hello"
     * @param amount the amount of characters to delete, if the amount is bigger or equal than the length of the string, return empty string, 
     * for example "hello", 10 -> 2
     * @return the new string after you delete a random characters "llo", "ell", "elo"
     */
    public static String randomDelete(String str, int amount) {
        if (amount >= str.length())
            return "";
        
        for (int i = 0; i < amount; i++) 
            str = randomDelete(str);  // calling the randomDelete method above and then replacing the str again and calling again and then replacing it again
        
        return str;
    }
}


