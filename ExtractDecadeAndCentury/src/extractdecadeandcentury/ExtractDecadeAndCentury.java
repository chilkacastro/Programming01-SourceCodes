/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractdecadeandcentury;

/**
 *
 * @author chilc
 */
public class ExtractDecadeAndCentury {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(1 / 2 * 2);  // 1 / 2 = 0.5(int so discard .5) 0 * 2 = 0(final answer)
        System.out.println(3.3 + 18 / 4 - 4 % (5 + 1));
    // ex: 2003 -> 21 century -> 00's 
    //     1689 -> 17 century -> 80's
    // CENTURY Step 1: extract the first two digit
        System.out.println(1689 / 100 + 1);     // prints 17(th century)
        System.out.println(1986 / 100 + 1);     // prints 20(th century)
    
    // DECADE Step 2: extract the third digit of 1689 -> 8
//                  Step 2.1 extract the last two digits   // 1986 - 1986 / 100 * 100 -> THIS IS THE SAME THING AS MODULO
//                    1986 % 100                // answer is 86
//                  Step 2.2 remove the 6 of 86 by using division / 10
//                    1986 % 100 / 10           // answer now is 8
//                  Step 2.3 multiply by 10 
        System.out.println(1986 % 100 / 10 * 10);   // will make 8 to 80(decade)
        
                       
               
               
               
    
    
    
    
    }
    
}
