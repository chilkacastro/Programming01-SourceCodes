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
public class MathClass {
    public static void main(String[] args) {
    /*
    Math Class   
        Math.PI
        Math.pow(a, b)      a power of b              Math.pow(2, 3)  -> 8        Math.pow(3, 2)  -> 9       Math.pow(4, 0.5) -> 2
        Math.sqrt(a)        square root of a          Math.sqrt(9)  -> 3     <-- same as -->    Math.pow(9, 0.5) -> 3
        Math.abs(a)         absolute value of a       Math.abs(-2) -> 2
        Math.round(a)       round a number            Math.round(3.8) -> 4        Math.round(3.14) -> 3
        Math.ceil(a)        round up a number         Math.ceil(3.00001) -> 4
        Math.floor(a)       round down a number       Math.floor(3.99999) -> 3
        Math.min(a, b)      the smaller number        Math.min(1, 2) -> 1
        Math.max(a, b)      the bigger number         Math.max(1, 2) -> 2
    */
    // to use pi-> Math.PI
        System.out.println(Math.PI);
        
    /* ACTIVITY 1
        1. ask the user to input the radius of a circle
        2. calculate the perimeter and the area of a circle
        3. calculate the volume and the surfaace area of the sphere with that radius
        4. print the result, with 2 decimal digits
        Radius  : 1.00
        ------------------
        2D:
        Area        : 3.14      pi r r
        Perimeter   : 6.28      2 pi r
        ------------------
        3D:
        Volume      : 4.19      4 / 3 pi r r r
        Surface     : 12.57     4 pi r r
    */
        // input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the radius of a circle: ");
        double radius = console.nextDouble();
        
        // calculation
        // 2D
        double perimeter = Math.PI * (Math.pow(radius, 2));
        double area = 2 * Math.PI * radius;
        //3D
        double volume = Math.PI * Math.pow(radius, 3) * 4 / 3;       // bring 4 / 3 in the end so that it will be calculated last and still be accurate(double value)
        // SOLUTION 2: 
        //double volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);        // 4 / 3 * Math.PI * Math.pow(radius, 3); -> ISSUE: all have same priority so if 4(int) / 3 (int) , the answer isn't accurate anymore
        double surface = 4 * Math.PI * Math.pow(radius, 2);
        
        // output
        System.out.printf("%-10s: %.2f\n", "Radius", radius);
        System.out.println("---------------------");
        System.out.println("2D");
        System.out.printf("%-10s: %.2f\n", "Area", area);
        System.out.printf("%-10s: %.2f\n", "Perimeter", perimeter);
        System.out.println("3D");
        System.out.printf("%-10s: %.2f\n", "Volume", volume);
        System.out.printf("%-10s: %.2f\n", "Surface", surface);
        
    }
    
}
