/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopexercise;

/**
 *
 * @author chilc
 */
public class LoopExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for a loop, you need 3 parts usually
            1. initialization
            2. condition
            3. update
        */
       int age = 15;        // initialization
       
        /*if (age < 18)         // no way for you to go back
            System.out.println("You are not an adult"); // one time print only */
       
        // using while loop
        while (age < 18) {           // condition
            System.out.println("You ane not an adult");
            age++;                  // update
        }
        System.out.println("Finish");
    }
    
    /**
     * To count the number of digits in a string
     * @param str input string "hello", "3.14"
     * @return the number of digits in the string, 0, 3,
     */
    public static int countDigit(String str) {                                                            // OKAY WITH FOR LOOP BECAUSE I KNOW THE String str-> so I know the length-- how long it is
        int count = 0;
        
        // go through the string (use the idx), 
        //take each character out, then use Character.isDigit()
        int idx = 0; // outside while loop but in line 53 it is ONLY use inside the WHILE loop so FOR loop is better
        while (idx < str.length()) {       // WHILE VERSION
            if (Character.isDigit(str.charAt(idx)))
                count++;
            // hidden else
                    // empty else statement
            idx++;      // this is not part of else statement but it is part of the WHILE loop -> this is the update            
        }
        return count;
        
        /* FOR version
        for (int idx = 0; idx < str.length(); idx++) // the classic way to go through a string
            if (Character.isDigit(str.charAt(idx)))
                count++;
        
        return count;
        */
    }
    
    /***
     * calculate the sum of numbers in range [num1, num2]
     * // assume num1 is no bigger than num2 --- so num1 is smaller than num2 e.g. [1, 5]
     * @param num1 the first boundary
     * @param num2 the second boundary
     * @return the sum of numbers in range [num1 , num2]
     */
    public static int sumRange(int num1, int num2) {          // if we know num1 and num2, we know how many iterations it will be                                                                                  // OKAY WITH FOR LOOP BECAUSE I KNOW HOW MANY ITERATION THERE WILL BE [1, 5]
        int sum = 0;
        
        int num = num1;         // at the beginning int num is 1 because num1 is 1
        
        while (num <= num2) {   // WHILE LOOP way
            sum += num;     // sum = 0 + 1      |   sum = 1 + 2    | sum = 3 + 1       | sum = 4 + 1 
            num++;
        }
        
        /* FOR LOOP way
        for (int num = num1; num <= num2; num++)
            sum += num;
        
        return sum;
        */
        
        return sum;
    }
    
     /***
     * calculate the sum of numbers in range [num1, num2]
     * // assume num1 is no bigger than num2 --- so num1 is smaller than num2 e.g. [1, 5]
     * @param num1 the first boundary
     * @param num2 the second boundary
     * @return the sum of numbers in range [num1 , num2]
     */
    public static int sumRange2(int num1, int num2) {
        // 1. to make sure that num1 is always smaller than num2
        // SWITCH num1 and num2
        if (num1 > num2) {   // I don't want to see num1 as the bigger one so if this is true, enter do the statement
            int temp = num1;    
            num1 = num2;
            num2 = temp;
        }    
        
        //2.  if num1 is now smaller than num2, you can now proceed
        int sum = 0;    
       
        int num = num1;
        while (num <= num2) {
            sum += num;     // sum = 0 + 1      |   sum = 1 + 2    | sum = 3 + 1       | sum = 4 + 1 
            num++;
        }
        
        return sum;
    }
    
    
    /* Another solution if you don't know the BOUNDARY YOU COULD HAVE A SOLUTION LIKE THIS:
    
    public static int sumRange(int num1, int num2) {
        int sum = 0;
    
        int num = Math.min(num1, num2);         // either you use Math.min(a, b) OR
        while (num <= Math.max(num1, num2)) {   // you do it here in the condition using Math.max(a, b)
            sum += num;
            num++;
            
        }
        return sum;
    }
    */


/*
While: if you DO NOT know how many iteration will have
For: if you DO know how many iteratin will have


Situations we don't know how many iteration there will be:
USE WHILE LOOP!!
    - bank account : master card or debit card -> machine tells you : hey do you want to do another operation--> so this is the kind of loop that ask you to go back if you want to do another operation; you can choose yes or no and then
it can give you the whole menu again with withdraw, deposit, display, transfer and everything--> you don't know how many loops there will be going back and forth
DOES ATM KNOW HOW MANY TIMES IT IS GOING TO LOOP? 
SAME WITH CALCULATOR -> YOU DON'T KNOW HOW MANY TIMES ITS GOING TO BE USED
SAME WITH GAME -> YOU DON'T KNOW --> ITS GOING TO ASK YOU AGAIN? DO YOU WANT TO PLAY AGAIN? NO IDEA OF HOW MANY LOOPS--> USER DOESN'T KNOW IF HE IS GOING TO CHOOSE YES OR NO-> SO NO IDEA IF LOOP STOPS OR CONTINUES

*/


/* 
Sequence 1-2-3-4-5-6

Selection 1-2-3-7-8-9-20-21-50
    if...else if...else if...else   99%
    switch case 1%
Loop 1-2-3-4-5-6-3-4-5-6-3-4-5-6-3-7-8-9
    while loop      4%
    do while loop   1%
    for loop        95%

while : if you DO NOT KNOW how many iteration will have
For: if you DO know how many iteratin will have
*/

// Loop Exercise Video 21

    /**
     * To reverse a String
     * @param str the original string "hello"
     * @return the reversed string "olleh"
     */
    public static String reverseString(String str) { // you cant directly reverse this original str string
        String str2 = "";        // so create a new String

        // loop to take each character out and add to str2
        for (int i = str.length() - 1; i >= 0; i--) 
            str2 += str.charAt(i);  // "" -> "o" -> "ol" -> "oll"

        // Another way
    //    for (int i = 0; i < str.length(); i++)
    //        str2 = str.charAt(i) + str2;  // "" -> "h" -> "eh" -> "leh"
    //    
        return str;
    }

    /**
     * To remove all digits in the string
     * @param str the original string   "a1b2c3"
     * @return the new string without digits "abc"
     */
    public static String removeDigits(String str) {
        String str2 = "";
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);         // this c only exists in the FOR LOOP
            if (!Character.isDigit(c))      // if c IS NOT a digit
                str2 += c;
        }

        return str2;
    }
//  When to create a variable? like char c ? you don't want repetition
    
    /**
     * To check if a number is a prime or not
     * @param num the number needs to be checked
     * @return if the number is prime or not
     * 4 : 1 4 2 F
     * 10 : 1 10 2 F
     * 7: 1 7 T
     */
    public static boolean isPrime(int num) { // prime is a number that can be divided one time
        // Any number can be divided by 1 // 1 is not a prime number
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) 
            if (num % i == 0)  // if remainder part is equal to 0 then it can be divided by something; use == not != -> ALWAYS THINK WHEN to RETURN
                return false;
            //else 
                  //; if just colon then you do not write the else
        return true; // outside for loop --> when nothing is divisible to it except one   
    }

    /** BETTER CODE FOR BIGGER NUM GIVEN
     * To check if a number is a prime or not
     * @param num the number needs to be checked
     * @return if the number is prime or not
     * 4 : 1 4 2 F
     * 10 : 1 10 2 F
     * 7: 1 7 T
     * What about if its? 100001
     *  1 * 36 
     *  2 * 18
     *  3 * 12
     *  4 * 9
     *  6 * 6 (stop here because halfway point) so u only check 1-6
     *   
     *  1, 2, 3, 4, (6), 9, 12, 18, 36
     * When you know 2 is a factor, you can also figure out 18 is a factor.
     * For every factor smaller then sqrt(36) it will have a corresponding
     * factor larger then sqrt(36). So by continuing after the halfway point
     * you will just find the factors you have already found
     * 
     * So if you know the number does not have any factors until the halfway point,
     * you can conclude that it has no factors(prime)
     *  
     */
    public static boolean isPrime2(int num) { 
        if (num <= 1)
            return false;
        
        double bound = Math.sqrt(num);
        for (int i = 2; i <= bound; i++) // if num is 2 it is a prime number so it will not do the for loop and just go to return true
            if (num % i == 0) //if there is no remainder then it is divisible to a number so not a prime
                return false; 
        
        return true; 
    }
    
    /**
     * To check if a string contains vowel(s) "aeiouAEIOU" or not
     * @param str the string you want to check
     * @return True if the string contains vowel(s) and False if not
     */
    public static boolean containsVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
            }
        }
        return false; // if you see nothing thats a vowel
    }
    
    /** VERSION 2
     * To check if a string contains vowel(s) "aeiouAEIOU" or not
     * @param str the string you want to check
     * @return True if the string contains vowel(s) and False if not
     */
    public static boolean containsVowel2(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return true;
        }
        return false; // if you see nothing thats a vowel
    }
}