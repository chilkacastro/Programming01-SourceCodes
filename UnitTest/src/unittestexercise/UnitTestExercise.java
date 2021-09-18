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
package unittestexercise;

/**
 * Unit Test Exercise and Debugging
 * @author Chilka Castro
 */
public class UnitTestExercise {
    /**
    * To calculate the factorial of a number
    * @param num : the input number
    * @return the factorial of that number 1 * 2 * 3 * 4 * 5
    */
    public static double factorial(int num) {
        if (num < 0)   // if a negative value then return it as Double.Nan
            return Double.NaN;
        
        double result = 1;                                                      // in factorial -> name it as result not sum  -> result should start with 1 because u cannot multiply by 0 
        for (int i = 2; i <= num; i++)                                          // when doing multiplication dont do i = 0 because result will always be 0 | also 1 multiplied to itself is 1 therefore start with 2
            result *= i;            // this is why you make result as 1 above
        
        return result;
    }
    
    /**
     * To check if a string is a palindrome or not. It is the same if you read a 
     * a palindrome word from left to right and right to left. 
     * (Case-insensitive). If the string is null, return false.
     * @param str a word 
     * @return if the word is palindrome
     * 
     * laval        true
     * Aibohphobia  true
     * apple        false
     * how are you  false
     * 123454321    true
     * !@#$$#@!     true   (special)
     * ""           true   (special)             // empty string
     * "a"          true
     * " p "        true    
     * null         false                        // null is not an empty string => null literally mean it doesnt exist
     */
    public static boolean isPalindrome(String str) { 
        // if str does not exist then return false
        if (str == null) 
            return false;
        
        // Create an empty String
        String str2 = "";
        
        // Reverse the word 
        for (int i = str.length() - 1; i >= 0; i--) 
            str2 += str.charAt(i);
        
        // Return true if they are equal and false if not | Compare the two strings
        return str.equalsIgnoreCase(str2); 
        
    }
    
    //SOLUTION 2
    public static boolean isPalindrome2(String str) { 
        // if str does not exist then return false
        if (str == null) 
            return false;
        
        str = str.toLowerCase(); // to make it case-insensitive
        
        // Reverse the word 
        for (int i = 0; i < str.length() / 2; i++) // only want to go through the half of the String
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))  //  str.charAt(str.length() - 1 is the last index and then by putting - i you are also checking the character of the word from right to left -> decreasing index | GETTING CLOSE TO THE CENTER
                return false;    // if one letter is not equal then return immediately | OVER
        // Return true if they are equal | if you went over the entire loop and the if wasnt activated then return true
        return true;
        
    }
    
    /** USING THIS METHOD FOR UNITTEST AND DEBUGGING
     * To calculate the Fibonacci sequence
     * @param num the input number
     * @return the Fibonacci sequence value of the number
     * 
     * F(5) --> 5
     * 
     * 
     * Input / Output pairs:
     * 3    ->  2
     * 6    ->  8
     * 0    ->  0
     * 1    ->  1
     * -3   ->  Double.NaN
     * 55   -> 139,583,862,445
     * 1234 -> 3.4774673918037020105E+257
     */
    public static double fibonacci(int num) {
        if (num < 0)
            return Double.NaN;
        
        if (num < 2)        // can be num == 1 but its better to put 2 to generalize it so it will handle f(0) and f(1) because f(0) = 0 and f(1) = 1
            return num;     // this is better because you can return immediately and not create num1, num2, and sum
        
        double num1 = 0;  // first given value
        double num2 = 1;  // second given value
        double sum = 0;

        for (int i = 2; i <= num; i++) {
            sum = num1 + num2;  // start with 0 + 1 so sum is now 1
            num1 = num2;        // num1 becomes 1 (update -> to be used on next one) 
            num2 = sum;         // num2 becomes sum which is 1 (update -> to be used on next one)
        }
        
        return sum;
    }
  
//    //put this because of debugging
//    public static void main(String[] args) {
//        System.out.println(fibonacci(3));
//    }
}


/*
Creating a Watch
plus diamond symbol

ex: when you want to follow
(num1 + num2) / (num1 / num2)

- highlight num1 + num2 so you can watch it

*/

/*
REMINDER: if you are going to put a breakpoint in the testing file -> dont do Debug Project while doing UnitTest --> do Debug Test in the UnitTestExerciseTest.java so it will bring you back or jump to the UnitTestExerciose
-so you basically have two choices : Debug Project(while you are in the source code part and it has a main calling the method you want to test) or Debug Test File(while you are in test file; no main method because you want to test the input/ouput pair|use step into here)
*/


/* Fibonacci
F(0) = 0
F(1) = 1
F(2) = F(0) + F(1) = 1
F(3) = F(1) + F(2) = 2
F(4) = F(2) + F(3) = 3
F(5) = F(3) + F(4) = 5
F(6) = F(4) + F(5) = 8

F(n) = F(n - 2) + F(n - 1)
*/
    

/*
Factorial
0 = 1
1 = 1
2 = 2
3 = 6


0 * 1 = 1 (in factorial)
1 * 1 = 1
1 * 2 = 2
2 * 3 = 6
6 * 4 = 24
*/

/*
QA: Quality Assurance 
Tester : Unit Test
TDD : Test-Driven Development 
    - design the unit tests even before you implement the body of the method

Steps :
    1. write the header and the doc of the method
    2. list some of the possible input/output pairs (common and special situations)
    3. convert those pairs in the last step in into some testing code
    4. write the body of the method
    5. test the method with those unit tests in step 3
        a. if all unit tests are passed, then you code is robust and ready to go
        b. if your code fails any unit test, you have to go back to modify your code in step 4

STEP 1
    /**
     * To calculate the factorial of a number
     * @param num : the input number
     * @return the factorial of that number 1 * 2 * 3 * 4 * 5
     */

//    public static double factorial(int num) {
//      retun 0; // put this temporarily before doing the method
//    }
/*   STEP 2 
    input/output pairs list : 3 normal and 3 special operations
        3 -> 6.0                  normal / common
        5 -> 120.0                normal / common
        10 -> 3628800.0           normal / common
        0 -> 1.0                  special    (special situations can sometimes be 0 and 1) 
        1 -> 1.0                 special
        99999   ->              big number -> can it handle 99999 (big number)
        -3 -> Double.Nan            negative
*/

/*
Testing in the main is not the best way so REMOVE THE MAIN methodwhen doing UNIT Test
because with the main you are doing manual checking
*/

/*
UnitTestExercise -> Source Package -> unittestexercise -> UnitTestExercise (right-click)-> Tools -> Creat/Update Tests
Check : public, protected, package private
Check : (1)Defaul Method Bodies, Generated Comments : (2)Javadoc Comments , (3)Source Code Hints
*/

/* Test Package -> UnitTesTExerciseTest
/**
 *
 * @author Chilka Castro
 */
//public class UnitTestExerciseTest {
/*   
    public UnitTestExerciseTest() {
    }
*/
    /**
     * Test of factorial method, of class UnitTestExercise.
     */
//    @Test
/*
    public void testFactorial() {
        System.out.println("factorial");                                           // prints "factorial" -> just to say that you are testing the factorial method in case there are several methods 
        int num = 0;
        double expResult = 0;                                                      // THE EXPECTED RESULT                                               
        double result = UnitTestExercise.factorial(num);                           // means that you are calling the factorial(num) method passing the value 0(num) into it and thE -> UnitTestExercise.factorial(num); will calculate the result 
        assertEquals(expResult, result);                                           // basically comparing the expected result and the result -> are they the same or not? the third value 0.0 is the tolerance(incase they are not exactly the same but you are tolerating it so it can pass the test) // Tolerance of 0.0 means they need to be exactly the same (no tolerating even the tiniest difference)
        // TODO review the generated test code and remove the default call to fail.  // remove this line
        fail("The test case is a prototype.");                                       // remove this line too
    }
    
}
- boolean -> put return true; temporarily
- only the double value has tolerance ; int does not have that
*/

/*
To run the test : right click this java class(UnitTestExercise) and click run Test or do ctrl + F6
- you can expand so you know which one input/output pair failed -> ex: factorial6
- then fix that so you can retest again to see if it passes
- KEEP FIXING AND TESTING IT AGAIN UNTIL IT PASSES 100% 
*/


/*
Create/Update Test when adding another method so that the test will be updated
*/

/*
- Experience Testing
- Unit Test 
- These are called black box testing. Not seeing the details
- White box tester -> seeing the code directly
- Unit Test is a black box testing -> giving the method to the person/user. Asking the user to test it for you
*/

// null vs. empty string
/*
public static void main(String[] args) {
    String str = "";
    System.out.println(str.length());  // will print 0
*/

/*
public static void main(String[] args) {
    String str = null;    // string does not exist
    System.out.println(str.length());  // will give an error -> exception -> java.lang.NullPointerException 
// with null you can never use str.  -> you can never use dot
*/

/*
null can only be applied to object like String
it cannot be applied to int num = null, double num = null, boolean num = null, char num = null

these are primitive variables

String is an object that is why null works in String num = null;
*/


