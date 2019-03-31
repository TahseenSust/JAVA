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
public class thread2 extends Thread{
    @Override
    public void run()
    {
        for(int i = 0;i<5;i++)
        {
            Assignment1.s2[i] = Assignment1.arr3[i] + Assignment1.arr4[i];
        }
    }
}
