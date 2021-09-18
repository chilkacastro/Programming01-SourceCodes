/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author chilc
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* methods : to do something e.g. :
            str.charAt(0)           // return an char
            str.length()            // return an int
            str.substring(1, 4)     // return a String
            nextDouble()            // return a double
            println()               // no return (void)
        */
        // You want to keep your code DRY(Don't Repeat Yourself) not WET(Write Everything Twice) code
        /* problem of putting it all in the main
        Problem 1: doing more than one thing
        Problem 2: may have WET code
        */        
        String name = "aAA bBb cCc";
        int spaceIdx = name.indexOf(' ');
        String fname = name.substring(0, spaceIdx);
        fname = Character.toUpperCase(fname.charAt(0)) + fname.substring(1).toLowerCase();  // Aaa
        String lname = name.substring(spaceIdx + 1);
        lname = Character.toUpperCase(lname.charAt(0)) + lname.substring(1).toLowerCase(); // Bbb
    }
    
}
