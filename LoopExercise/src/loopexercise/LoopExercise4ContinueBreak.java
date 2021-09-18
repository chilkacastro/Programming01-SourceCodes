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

import java.util.Random;

/**
 *
 * @author Chilka Castro
 */
public class LoopExercise4ContinueBreak {
    public static void main(String[] args) {
        printNoThreeGame(30);
        printNoThreeGame2(30);
        printNum(10, 2);
    }
    /**
     * To remove vowels from a String
     * @param str the original String
     * @return the new String without any vowel
     */
    public static String removeVowel(String str) { //"hello"
        String str2 = "";
        String vowels = "aeiou";
        
        for (int i = 0; i < str.length(); i++) 
            if (!vowels.contains(str.substring(i, i + 1).toLowerCase()))        // reads IF ITS NOT A VOWEL //instead of Character.toLowerCase(str.charAt(i))  since .contains("wants a String" here not a single character);
                str2 += str.charAt(i); //in if // add that character in str2
            // hidden else -> you dont do anything if its a vowel because it wouldnt add it in str2
        return str2;
    }
    
    /**
     * To remove vowels from a String
     * @param str the original String
     * @return the new String without any vowel
     */
    public static String removeVowel2(String str) {
        String str2 = "";
        String vowels = "aeiou";
        
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.substring(i, i + 1).toLowerCase()))         // reads "IF ITS A VOWEL"
                continue;       // skip the current iteration, directly start the next iteration -> YOU WILL NOT REACH THE NEXT LINE BECAUSE YOU "continue" to the next iteration | WILL IGNORE THE NEXT CODES to go to the next iteration
            str2 += str.charAt(i);        // outside of IF                      // reads "IF ITS not A VOWEL"  
            System.out.println("this is iteration" + i);
        }
               
        return str2;
    }
    
    /**
     * To print a number that satisfy the no three game
     * if a number contains 3 e.g. 13, 31 
     * or if a number can be divided by 3 e.g. : 12, 66
     * then you want to skip it
     * output example: 20(upper boundary) -> 1  2   4   5   7   8   10  11  14  16  17  19  20  --> anything with 3 and is divisible by 3 is skipped (3 6 9 15 18)
     * @param num upper boundary of number                                      -- ex: if upper boundary is 10 then you dont want to cross 10 then thats the bound
     * 
     * BUT You want to skip anything that has 3 like 13  31   
     * OR any number divisible by 3 like 6 which  6 / 3 = 2
     */ 
    public static void printNoThreeGame(int num) {
        for (int i = 1; i <= num; i++) 
            if (i % 3 != 0 && !("" + i).contains("3"))                          // NOT DIVIDED BY 3 AND DOES NOT CONTAIN 3 // ("" + i).contains("3")   -> "" + i will turn it into a number and then .contains checks if it DOES NOT contains "3"
                System.out.printf("%d\t", i);
    }
    
    // another way using CONTINUE and the reverse of the one above (MORGENS LAW)
    public static void printNoThreeGame2(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 || ("" + i).contains("3"))                          // Morgen's Law - Reverse it -> DIVIDED BY 3 AND CONTAIN 3 
                continue; // skip this current iteration and go to the next one             // benefit of continue is when theres a lot of code --> good when you want to skip some codes
            System.out.printf("%d\t", i);
        }
    }
    
    
    // USING BREAK
    
    /**
     * To generate random numbers in range [0, bound), it will stop when the
     * quitNum is generated
     * output example : 10, 2 -> 6  7   4   8   8   9   1   7   5   2            -> not reaching 10
     * @param bound the upper bound for the range
     * @param quitNum the number to stop
     */
    public static void printNum(int bound, int quitNum) {
        Random rand = new Random();
        
        while (true) {  
            int num = rand.nextInt(bound);                                      // so if the bound is 10 --> it will only generate 0, 9 excluding 10
            System.out.println(num + " ");     // moved here to also show that quitNum is printed  
            if (num == quitNum)
                break;                                                          // stop the entire loop, and execute the code after the loop  
            // System.out.println(num + " "); move this above
        }
        // if you have a code here it will execute them because it is outside the loop now
        System.out.println("Bye");  // this will be printed once the loop is done or broken using break
    }
}
/* before it became an inifinity loop which is while (true)
while (rand.nextInt(bound) != quitNum)                // you do not know how many times it will iterate   // as long as the generated number is not equal to the quitNum
    rand.nextInt(bound); // number that wouldnt be reached      // YOU CANNOT DO THIS BECAUSE BOTH GENERATED NUMBERS WILL NO LONGER BE THE SAME NUMBER


// SHRINK THIS ONE TO CURRENT
while (true) {  
            int num = rand.nextInt(bound); 
            if (num != quitNum)
                System.out.println(num + "");
            else
                break;          // stop the entire loop, and execute the code after the loop 
        }
        // if you have a code here it will execute them because it is outside the loop now
    }

*/

/* THIS IS FOR CHECKING IF THE CODE WORKS -> it will show the quitNum 
public static void printNum(int bound, int quitNum) {
        Random rand = new Random();
        
        while (true) {  
            int num = rand.nextInt(bound);                                      // so if the bound is 10 --> it will only generate 0, 9 excluding 10
            System.out.println(num + " ");          // MOVE THIS LINE HERE IF YOU WANNA SEE THE quitNum printed too before it stops generating
            if (num == quitNum)
                break;                                                          // stop the entire loop, and execute the code after the loop  
        }
*/

/*
continue : stop the current iteration, start the next iteration (still inside loop)
break : stop the entire loop, start the code (outside loop, inside method)
return : stop the entire method (outside loop, outside method)
*/