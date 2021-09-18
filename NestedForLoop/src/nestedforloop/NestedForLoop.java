/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop;

/**
 *
 * @author chilc
 */
public class NestedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 6;
        for (int i = 0; i <= num; i++) { 
            for (int j = 0; j <= num; j++);
         }
   }  
  
    //------------------------------------------
                
                      // String str = "";
        
//        for (int i = 0; i < 5; i++) {
//            String str = "";
//            str += "*";
//            System.out.println(str);
//        }
    /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                for (int a = 0; a < 5; a++)
                    System.out.println("hi");
        }
    */
       /* for (int i = 0; i < 5; i++)
            for (int j = 0; j < i; j++)
                for (int a = 0; a < j; a++)
                    for (int b = 0; b < a; b++)
                        System.out.println("hi"); */
}
    

