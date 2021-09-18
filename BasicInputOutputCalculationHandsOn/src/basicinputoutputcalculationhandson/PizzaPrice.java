/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicinputoutputcalculationhandson;

import java.util.Scanner;

/**
 *
 * @author chilc
 */
public class PizzaPrice {

    /*
    For each pizza, the dough cost $2, for each kind of meat, you pay 3$,
    for each kind of vege, you pay $1.5.
    
    For delivering, the price is $0.732 per kilometer
    
    system will ask how many kind of meat/cheese do you want, how many vege? how
    far (km) away are you from the restaurant.
    
    use the printf to print the result
    Meat/cheese:          3
    Vege:                 2
    Distance(km):       6.0
    -----------------------
    Final Price:      16.39
    */
    public static void main(String[] args) {
        // Input
        Scanner console = new Scanner(System.in);
        System.out.println("How many meat/cheese do you want? ");
        int meat = console.nextInt();
        System.out.println("How many vege do you want? ");
        int vege = console.nextInt();
        System.out.println("How far (km) do you live? ");
        double distance = console.nextDouble();
        
        // Calculation
        double meatPrice = 3;               //don't use magic numner
        double vegePrice = 1.5;
        double deliverPricePerKm = 0.732;
        double finalPrice = meat * meatPrice + vege * vegePrice + distance *    // don't cross the red line too much (reach 100 characters is penalty)
                deliverPricePerKm;                                              // if one line is not finished, the confuses line needs two indents
        
        // Output                                                               // don't put more than one empty line in your code
        System.out.printf("%-20s%5d\n", "Meat/Cheese:", meat);
        System.out.printf("%-20s%5d\n", "Vege:", vege);
        System.out.printf("%-20s%5.1f\n", "Distance(km):", distance);
        System.out.println("-------------------------");
        System.out.printf("%-20s%5.2f\n", "Final Price:", finalPrice);
        
    }
    
}
