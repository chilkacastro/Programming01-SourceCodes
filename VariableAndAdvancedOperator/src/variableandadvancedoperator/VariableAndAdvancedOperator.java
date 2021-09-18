/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableandadvancedoperator;

/**
 *
 * @author chilc
 */
public class VariableAndAdvancedOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int num = 3.14;  // this doesn't work 
//        int num2 = 5;
//        char c;
//        double num3 = 3.14;   // variable initialization  
//        num3 = 1;       // prints 1.0 because it is a double
//        num3 = 1 + 2;    // write
//        double num4 = num2 + num3;
//        System.out.println(num3);       // read         //prints 1.0
        
        // Another example of using variable
        int year = 1620;    // so you can manually change it only one time
        System.out.println(year / 100 + 1);
        System.out.println(year % 100 / 10 * 10);
        
        
        // Advanced Operators: +=, -=, *=, /=, %/ (with spaces around)
        double amount = 0;
        amount = amount + 3;
        amount += 3;    // += Advanced operator same thing with line above
        
        double salary = 3000;
        double increaseRatio = 0.1;
//        salary = salary * 1.1;  // same as salary = salary + salary * 0.1;
        salary *= 1 + increaseRatio;  // 1.1    // same thing with line above
    
        double price = 99.99;   // discount of 20% --> 100% - 20 % = 80% or 0.8
        price = price* 0.8;
        price *= 0.8;       //*= one single operator
        
        
        // Advanced Operators: ++, --   (no spaces around)
        int count = 0;
        count++;    // same as count += 1; OR count = count + 1;
        System.out.println(count); // prints 1
        
        int timer = 60;
        timer--;    // same as timer -= 1; OR timer = timer - 1;
        System.out.println(timer);  // prints 59;
        
    // same in these situations    
        ++count;    // count++;
        --timer;    // timer--;
        
        
    // not the same in these situation
        int a = 1;
        int b = 5;
        int c = a + ++b;        // if you have two equals, if the ++ is before,
                                // then first update the variable (plus one)
                                
                                
                                // if the ++ is after, then first ignore the update,
                                // calculate the equation pretending there is no ++;
                                // then update the variable
        
        System.out.printf("a: %d, b: %d, c: %d\n", a, b, c);     
        System.out.println(a++);    // PRINTS first -> so 1
//        System.out.println(++a);    // UPDATES first -> so 2;
        System.out.println(a);      // always be 2 in this example
        
//        // Another example
//        int num = 10;
//        int num2 = 3 + num++;
//        System.out.println(num);        // 11
//        System.out.println(num2);       // 13
//           

        // Another example
        int num = 3;
        int num2 = 3 + ++num;
        
        System.out.println(num);        // 4
        System.out.println(num2);       // 7
    }
    
}
