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
package escapesequence;

/**
 *
 * @author Chilka Castro
 */
public class EscapeSequence {
    
    /**
     * Escape Sequence
     *  - when you want to put something in the string, but you cannot directly
     * type it in the string, you use escape sequence instead
     * 
     * "hello "my friend"" -> How to do "my friend"?
     * 
     * \" -> "
     * "hello \"my friend\"
     * 
     * \" -> "
     * \n -> line breaker
     * \t -> tab
     * "\thello \"my friend\""
     * \\ -> \
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\thello \"my friend\"");
        System.out.println("C:\\User");
    
    /*
    Create two variables : String song, String location
    My favorite song is "xxxxx" <- one printf()
    current location:           <- one printf()
        "C:\Users\andre\Desktop\
    */
    String song = "xxxxx";
    String directory = "C\\Users\\andre\\Desktop";
    
    System.out.printf("My favorite song is \"%s\"\n", song);
    System.out.printf("Current location: \n\t\"%s\"\n", directory);
        
    }
    
}
