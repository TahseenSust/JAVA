/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Tahseen
 */
public class Throw {
    public Throw(int num)
    {
        if(num % 2 !=0)
            throw new ArithmeticException("Not Even");
        else
            System.out.println("Even");
    }
}
