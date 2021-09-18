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
package rectangular;

import java.util.Random;

/**
 * A Rectangular Class
 * @author Chilka Castro
 */
public class Rectangular {
    private int width;        // independent
    private int length;       // independent
   // private double area;       // Why you don't need this? You use width and length -> dependent | It can affect other data member | Lets say someone change the area? then width and length will also be changed
   // private double perimeter;  // Why you don't need this? You use width and length -> dependent | It can affect other data member
    private String color;
    private static int numOfSide = 4;  // CLASS LEVEL | only one numOfSide stored so directly initialized it here, which is 4| do not put inside the constructor | all objects have the same of this so it belong to the class
    // with static -> it it not a data member because it belongs to the class 
    /*
    You do not want to put data members that can be calculated with other data members
    */

    /**
     * Default constructor [1, 10]
     */
    public Rectangular() {
        Random rand = new Random();
        int minNum = 1;
        int maxNum = 10;
        this.width = rand.nextInt(maxNum - minNum + 1) + minNum;  //  tells you how much you need (maxNum - minNum + 1)-> makes this inclusive     and then shift is + minNum so it starts at 1
        this.length = rand.nextInt(maxNum - minNum + 1) + minNum;  // this is better because if minNum is 5 and maxNum is 10 [5, 10]
        this.color = "black"; 
    // Solution 2 for random width and length
        //this.width = rand.nextInt(10) + 1;    // so width and length would be different | it is wrong to create one random variable and then give it to both because you are generating only onre random and giving it to both of them; they are the same so square which is wrong
        //this.length = rand.nextInt(10) + 1;
    }
    
    /**
     * Constructor with all data members
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @param color the color of the rectangle
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    
    /**
     * Copy constructor
     * @param rectangular the rectangular object to copy 
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }
    
    /*
    When to put a parameter for a method in the class?
     -> DONT put if the parameter is a data member
    
    */
    
    /**
     * Calculates the area of a rectangular
     * @return 
     */
    public int calcArea() {  // I removed the static and also the parameter(int width, int length) -> OOP  // public accessible by others
        return width * length; 
    }
    
    /**
     * Calculates the perimeter of a rectangular
     * @return 
     */
    public int calcPerimeter() {
        return (width + length) * 2;
    }

    /* Just example for void :
    Let's say we have a private int area as data member
    
    public void calcArea() {
        area = width * length;   // you can directly just do area instead of the return word 
    
    }
    */
    
    /**
     * Compares two rectangular objects
     * @param rectangular the rectangular object to compare with
     * @return True if the rectangular objects are the same and False if not
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width &&
                this.length == rectangular.length &&
                this.color.equals(rectangular.color);
    }
    
    /**
     * Generates a String that represents a rectangular
     * @return the string that represents a rectangular
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10d %s\n", "Width", width);
        str += String.format("%-10d %s\n", "Length", length);
        str += String.format("%-10s %s\n", "Color", color);
        str += String.format("%-10d %s\n", "Area", calcArea());
        str += String.format("%-10d %s\n", "Perimeter", calcPerimeter());
        
        return str;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
