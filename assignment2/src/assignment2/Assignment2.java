/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;
/**
 *
 * @author Tahseen
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();

        Throw th = new Throw(a);

        b = input.nextInt();
        c = input.nextInt();

        Throws th1 = new Throws();

         try {
            System.out.println(th1.division(b, c));
        }catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
    }
    
}
