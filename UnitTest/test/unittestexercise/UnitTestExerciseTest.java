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

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chilka Castro
 */
public class UnitTestExerciseTest {

    public UnitTestExerciseTest() {
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial1() {
        System.out.println("factorial");
        int num = 3;
        double expResult = 6.0;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);       // 0.01 tolerance (tolerating that tiny difference)
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial2() {
        System.out.println("factorial");
        int num = 5;
        double expResult = 120;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial3() {
        System.out.println("factorial");
        int num = 10;
        double expResult = 3628800.0;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial4() {
        System.out.println("factorial");
        int num = 0;
        double expResult = 1.0;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial5() {
        System.out.println("factorial");
        int num = 1;
        double expResult = 1.0;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial6() {
        System.out.println("factorial");
        int num = -3;
        double expResult = Double.NaN;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of factorial method, of class UnitTestExercise.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int num = 0;
        double expResult = 0.0;
        double result = UnitTestExercise.factorial(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome1() {
        System.out.println("isPalindrome");
        String str = "laval";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome2() {
        System.out.println("isPalindrome");
        String str = "Aibohphobia";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome3() {
        System.out.println("isPalindrome");
        String str = "apple";
        boolean expResult = false;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome4() {
        System.out.println("isPalindrome");
        String str = "how are you";
        boolean expResult = false;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome5() {
        System.out.println("isPalindrome");
        String str = "123454321";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome6() {
        System.out.println("isPalindrome");
        String str = "!@#$$#@!";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome7() {
        System.out.println("isPalindrome");
        String str = "";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome8() {
        System.out.println("isPalindrome");
        String str = "a";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome9() {
        System.out.println("isPalindrome");
        String str = " p ";
        boolean expResult = true;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome10() {
        System.out.println("isPalindrome");
        String str = null;
        boolean expResult = false;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class UnitTestExercise.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String str = "";
        boolean expResult = false;
        boolean result = UnitTestExercise.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int num = 3;
        double expResult = 2;
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);                                  // true -> same even if you give me 2.00000005 --> the difference between 2.0 and 2.00000005 is still tolerable because .00000005 is smaller than 0.01
       
    }
    
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci2() {
        System.out.println("fibonacci");
        int num = 6;
        double expResult = 8;
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);
       
    }
    
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci3() {
        System.out.println("fibonacci");
        int num = 0;
        double expResult = 0;
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);
       
    }
    
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci4() {
        System.out.println("fibonacci");
        int num = 1;
        double expResult = 1;
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);
       
    }
    
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci5() {
        System.out.println("fibonacci");
        int num = -3;
        double expResult = Double.NaN;
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);
       
    }
    
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacci6() {
        System.out.println("fibonacci");
        int num = 55;
        double expResult = 1395838624.45E2;                                        // integer number to large : 139583862445  | E2 means 10 power of 2 so 100  -> 1395838624.45E2 
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 0.01);
       
    }
    /**
     * Test of Fibonacci method, of class UnitTestExercise.
     */
    @Test
    public void testFibonacc7() {
        System.out.println("fibonacci");
        int num = 1234;
        double expResult = 3.4774673918037020105E+257;                          
        double result = UnitTestExercise.fibonacci(num);
        assertEquals(expResult, result, 1E+255);                                // 3.4774673918037020105E+257;  --> MAKE THE THRESHOLD higher because the last digit which is 5 in this case could be wrong
                                                                                // 1E+257 becomes higher so 1E+255 means the difference is .01
    }
    // 257 - 2 so make it 255  -> 0.01 because you shifted to the left -> INCREASING THE TOLERANCE
    // 294 and 4 is the 257th place then moving to the left by 2 will 0.01 (2)

}
