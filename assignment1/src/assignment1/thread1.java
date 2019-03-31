/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Tahseen
 */
public class thread1 extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            Assignment1.s1[i] = Assignment1.arr1[i] + Assignment1.arr2[i];
        }
    }
}
