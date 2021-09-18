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
package student;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Chilka Castro
 */
public class Test {
    // Create a main by yourself to create an object
    public static void main(String[] args) {
        // Different from creating object
        double num1 = 1;
        char c = 'a';
        String str = "hello";
        // Printing primitive
        System.out.println(num1);  // prints with no issue
        System.out.println(str);  // prints with no issue
        
        //Left side (objects) = Right side constructor examples
        Scanner console = new Scanner(System.in);                               // left side Class(Scanner) console (name of obejct) | right side -> Scanner and then bracket() -> a constructor  
        Random rand = new Random();                                             // righgt side -> Random(); -> uppercase R and bracket so it is a constructor

        // Creating a object using the constructor
        Student stu1 = new Student("Yi", "0001", 35, "123456789");
        Student stu2 = new Student("Wang", "0002", 35);
        Student stu3 = new Student(); // if you dont provide a constructor, java will make one for u-> default constructor | but if you have other constructors -> then java will give error because you aren't a poor soul with no constructor
        Student stu4 = new Student();
       // Student stu5 = new Student("Yi", "0001", 35, "123456789"); // deep copy
        
        // Shallow Copy -> just copy the address(reference) of an object to another reference 
        Student stu6 = stu1;  // same reference(to the address of value) stu6 will have the same values as stu1. But will stu6 and stu5 will be the same?
                              // two references but one piece of the real data. Two references (stu6 and stu1) pointing at the one piece of real values // CALLED SHALLOW COPY
                              // DOES NOT create a new second piece of memory to store the data
                              // same student object -> just different names for the object (stu6 and stu1)
        
        /* TO TEST IF stu6 and stu5 will still be the same
        if stu1's age becomes 55 and stu5 is still the same. stu5 will remain 35 but stu6 will become 55 too like stu1.
        Once you changes stu1 then stu6 is also affected
        or use equal equal to check if they are the same (==) 
        */
        //-------------------------------------------------------------------------------
        // Using the copy constructor //DEEP COPY
        Student stu5 = new Student(stu1); // creating a new Student by copying the values of stu1
                                          // createss a new second piece of memory to store the data
        
        
        // Seeing the difference of shallow copy and deep copy by comparing :
        // Comparing the reference(the address of the values) (FIRST PIECE)
        System.out.println(stu1 == stu5); // false -> they both have new address -> pointing at different storage of the values
        System.out.println(stu1 == stu6); // true -> same address to the real value-> pointing at the same storage of values
        // Comparing the values (SECOND PIECE)
        System.out.println(stu1.equals(stu5));  // true -> values are the same
        
        double num3 = 1;
        double num4 = num3;  // value of num3 is directly copied
        
        // Printing an object
        System.out.println(stu1);  // you need toString because without the toString this would print only the reference to the address of the real value(step 1) only
        // System.out.println(stu1); is the same thing as System.out.println(stu1.toString()); -> its okay even if you dont put .toString()
        System.out.println(stu2);
        System.out.println(stu3);  // same object values
        System.out.println(stu4);  // same object values
        
        // Check if the same
        int num = 5;
        int num2 = 5;
        // Comparing Primitive variables
        System.out.println(num == num2); // True
        // Comparing Objects
        System.out.println(stu3 == stu4); // WRONG! NEVER use == to compare two objects if you want compare their values because the results can be strange      // False ->you are only comparing the two addresses but not the object values. WHY? always remember that they both have different memory allocations
        System.out.println(stu1 == stu5); // False (WRONG WAY)
        // both are the same- arrangement doesnt matter
        System.out.println(stu1.equals(stu5)); // True (CORRECT WAY) // comparing the value inside
        System.out.println(stu5.equals(stu1)); // True (CORRECT WAY) // comparing the value inside
        // Comparing objects that have null values -> code crashes
        System.out.println(stu3.equals(stu4)); // code will crash -> both are created with default constructor with null for String
        // inside the equal method in the student class it will have .equals in the String level --> stu3 name and stu 4 name is null so it will crash
        // both names are null so code crashes |  name.(dot) so crash 
        
        // null
        Student s = null; // then you cannot use anything with "obj."  // this is allowed; you can give a null to an address. Means the address does not exist
        // code gives error if you do this
        System.out.println(s.toString()); // WRONG because s is null-> you cant use obj.
        // If you wanna compare something null do :
        System.out.println(stu1 == null);  // False because stu1 is not null // Why == for null? because null is stored directly in the first piece of memory(no second piece)
        System.out.println(s == null);  // True
    
    
    // Accessing data members of Student class
        System.out.println(stu1);  // okay no issue because the .toString() method is public so you can access it through printing
       // System.out.println(stu1.name);  -> WRONG red line| you are not allowed to directly do this  -> name is private data member 
       stu1.setName("Wang");
       System.out.println(stu1.getName());   // return you the  value of the name of student1
    }
    
}

/*
Shallow copy : if you just copy the address  like stu1 and stu6 (have same address pointing at the data)
Deep copy : if you literally copy the valuess that would be a deep copy. 
    2 ways to do a deep copy is : using copy constructor (1) and the clone method(2)
*/