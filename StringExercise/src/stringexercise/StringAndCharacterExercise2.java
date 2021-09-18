/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexercise;

import java.util.Scanner;

/**
 *
 * @author chilc
 */
public class StringAndCharacterExercise2 {
    public static void main(String[] args) {
        // RECALL OF StringExercise1
        int num = 5;
        String str = "Hello";
        
        System.out.println(str.length());
        // index (0, len -1]
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.contains("z"));
        
        System.out.println(str.substring(1, 3));        //el
        System.out.println(str.substring(1));           // <-- PREFFERED WAY (ONE PARAMETER) ello  // same as (str.substring(1, 5); -> this is not the preferred way 
        
        str = str.toUpperCase();            // make uppercase of str PERMANENT -> store or re-store it inside a variable 
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        
        // String format -> to generate a string
        String name = "Yi Wang";
        int age = 35;
        String str2 = String.format("%-10s: %s\n%-10s: %d",     // no d\n at the end because... 
                "Name", name, "Age", age);
        System.out.println(str2);               //... line break ln is already here
        
        /* Character
           1. Character.toUpperCase()
           2. Character.toLowerCase()
           3. Character.isUpperCase()       // is indicates boolean so true or false
           4. Character.isLowerCase()
           5. Character.isDigit()
           6. Character.isLetter()
           7. Character.isWhiteSpace()
        */
        char c = 'a';
        c = Character.toUpperCase(c);               // will make the character uppercase PERMANENT -> store or re-store it inside a variable
        System.out.println(c);
        
        // isUpperCase example
        System.out.println(Character.isUpperCase(c));  // true
        System.out.println(Character.isLowerCase(c));  // false
        
        // isDigit
        System.out.println(Character.isDigit(c));      // false
        System.out.println(Character.isDigit(9));      // false -> java will convert it into a charater-> check ASCII TABLE asking what is that 9 stands for- what is character 9 so it will give you false
        
        // isLetter
        System.out.println(Character.isLetter(c));     // true

        /*
        ACTIVITY 1
            1. ask the user to input its name, assume the name contains one space: "Yi Wang",
            store the name into String name;
            2. create two variables: String fname, String lname
            3. separate the fname and the lname from the name, and store it in the fname and lname
            4. then print the result:
        
            Name:         Yi Wang
            First Name  : Yi
            Last Name   : Wang
        */
        
    // INPUT
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name1 = console.nextLine();                      // Separate full name to first name and last name so both have 0 index
  
    // PROCESSING
        int spaceIdx = name1.indexOf(' ');
        // first name
        String fname = name1.substring(0, spaceIdx);
        fname = Character.toUpperCase(fname.charAt(0)) +        // using -> Character.toUpperCase() and using the String -> _____.toUpperCase()
                fname.substring(1).toLowerCase();               // restoring it all to fname variable -> RE-USING VARIABLE
        /*
        ACTIVITY 1.2:  [if input is yI wAnG] fix it by doing:
            - separate the fname to first character, and the rest part
            - the first character to uppercase, the rest part to lowercase
            - join the two parts back together again
        */
        // last name
        String lname = name1.substring(spaceIdx + 1);
        lname = Character.toUpperCase(lname.charAt(0)) +      // using -> Character.toUpperCase() and using the String -> _____.toUpperCase()
                lname.substring(1).toLowerCase();             // restoring it all to lname variable -> RE-USING VARIABLE
        
        // Combine first name and last name again
        name1 = fname + " " + lname;                           // prints "Yi Wang" to fix the user input full name which is yI wAnG(not printed)
        
    // OUTPUT
        System.out.printf("%-15s: %s\n", "Name", name1);
        System.out.printf("%-15s: %s\n", "First Name", fname);
        System.out.printf("%-15s: %s\n", "Last Name", lname);
   

    /*
    ACTIVITY 2:
        1. first ask the user to input a sentence e.g.: "hey, WHAT'S up?"
        2. ask the user to input an index, e.g.: 2  (assume the index is valid)
        3. remove that character from the original sentence "he, WHAT's up?"
        2. convert the string into title case (the first character upper, the rest lower) e.g. : "Hey, what's up?"
        3. print the output
        Original String: hey, WHAT's up?
        Modified String: Hey, what's up?
 
        // input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String sentence = console.nextLine();
        
        // procesing
        String sentence2 = Character.toUpperCase(sentence.charAt(0)) 
                + sentence.substring(1).toLowerCase();
        
        // output
        System.out.printf("%-15s: %s\n", "Original String", sentence);
        System.out.printf("%-15s: %s\n", "Modified String", sentence2);
    */   
        
    /* ACTIVITY 2.1:
        1. first ask the user to input a sentence e.g.: "hey, WHAT'S up?"
        2. ask the user to input an index, e.g.: 2  (assume the index is valid)
        3. remove that character from the original sentence "he, WHAT's up?"
        4. convert the string into title case (the first character upper, the rest lower) e.g. : "He, what's up?"
        5. print the output
        Original String: hey, WHAT's up?
        Modified String: He, what's up?
    */    
    
    // input
//        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String sentence = console.nextLine();
        System.out.print("Please enter an index: ");
        int idx = console.nextInt();
        
        // procesing
        String sentence2 = sentence.substring(0, idx) + sentence.substring(idx + 1);    // to remove a character: Step : put idx as excluding in substring and then add the others by doing (idx + 1) so it will copy the remaining ones
        sentence2 = Character.toUpperCase(sentence2.charAt(0)) 
                + sentence2.substring(1).toLowerCase();
        
        // output
        System.out.printf("%-15s: %s\n", "Original String", sentence);
        System.out.printf("%-15s: %s\n", "Modified String", sentence2);
        
    }
}
