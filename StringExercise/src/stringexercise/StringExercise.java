/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexercise;

/**
 *
 * @author chilc
 */
public class StringExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "hello";         // String is a class, str is an object
        String str2 = "hi";
        System.out.println("3.14".length());    // can be understood as 's
        
        System.out.println(str1.length() + str2.length() * 2);
        int len1 = str1.length();
        int len2 = str2.length();
        // len1 = 5         len2 = 2
        System.out.println(len1 % len2);            // 1
        System.out.println(len2 % len1);            // 2
        
        // Joining two strings using addition
        System.out.println(str1 + " world");        // put space before world
        System.out.println(1 + "world");            // "1" + "world" -> "1world  // makes 1 into a string so it matches with the world string
        System.out.println(1 + 2 + "world");        // 3world
        System.out.println(1 + (2 + "world"));      // 12world
        
        // Questions:
        // ERROR: SINGLE QUOTE -> System.out.println('a'.length());
        System.out.println("3 + 4 =" + 3 + 4);      // 3 + 4 = 34
        System.out.println("3 + 4 =" + (3 + 4));    // 3 + 4 = 7
        System.out.println(3 + 4 + " = 3 + 4");     // 7  = 3 + 4 
        System.out.println(3 + "3+4".length());     // 6 because (3 + 3) 
        System.out.println(3 + "hello".length());   // 8
        System.out.println((3 + "3+4").length());   // 4 because (3 + "3+4") -> "3" + "3+4" -> "33+4" 
        
        // Last index is str1.length() -1 
        
        // charAt() -> will give you a specific character
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(4));
        

        str1 = "hello world";
        String str3 = "Hello World";
        System.out.println(str1.charAt(str1.length()-1));       // will give you last index -> d
        // indexOf and lastIndexOf
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.lastIndexOf('l'));
        System.out.println(str1.lastIndexOf('H'));              // will give you -1 because it is CASE-SENSITIVE there is no H uppercase
        
        // contains
        System.out.println(str1.contains("e"));
        System.out.println(str1.contains("hell"));
        System.out.println(str1.contains("helo"));
        
        // toUpperCase
        System.out.println(str1.toUpperCase());         // hello world becomes HELLO WORLD         // temporary only
        System.out.println(str3.toLowerCase());         // Hello World becomes hello world         // temporary only
        System.out.println(str1);                       // hello world IS STILL hello world -> line above it wouldn't change it
        System.out.println(str3);                       // Hello World IS STILL Hello Wolrd -> line above it wouldn't change it
        
        // to make it PERMANENT to be a lowercase you need to do
        str3 = str3.toLowerCase();                      // re-store it in the same variable to make the change PERMANENT
        System.out.println(str3);                       // str3 is now PERMANENT lowercase 
        
        // substring
        String str4 = "Hello World";
        System.out.println(str4.substring(1,3));        // Hel [start, end) -> excluding the 3rd index
        System.out.println(str4.substring(0, str1.indexOf(' '))); // Hello      // starts at H and stops at o which is excluding the ' ' space
        
        // substring
        String name = "Yi Wang";
        String fname = name.substring(0, name.indexOf(' '));        // Yi -> starts at Y and stops at i which is excluding the ' ' space
        String lname = name.substring(name.indexOf(' ') + 1);       // Wang -> ONE PARAMETER ONLY starts at W until the end     [PREFERED WAY] if you don't want to indicate where to end   
        // IF TWO PARAMETERS and still prints the same last name which is Wang
//        String lname = name.substring(name.indexOf(' ') + 1, name.length());  -> same thing as  name.substring(name.indexOf(' ') + 1);
    
        System.out.println(fname);
        System.out.println(lname);
    }
    
}
