/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;

//At each run the position of stars won't be same as every time the star chooses random area....


class counter
{
    int count;
    public  void increment()  //After using Synchronized keyword we notice that count value is 2000 as 
                                          //Only one thread is having the control of method at any point of time
    {
//        System.out.println(Thread.currentThread().getName());
        count++;
    }
   
}

public class star_thread 
{
     public static void main(String args[]) throws Exception
    {
       
      counter c1 = new counter();
        
        Runnable th1;
        th1 = () ->
        {
              for(int i=1;i<=30;i++)
            {
                c1.increment();
            }
        };
        
        Runnable th2;
        th2 = () ->
        {
              for(int i=1;i<=30;i++)
            {
                c1.increment();
            }
        };
        Runnable th3;
        th3 = () ->
        {
              for(int i=1;i<=50;i++)
            {
                c1.increment();
            }
        };
        Runnable th4;
        th4 = () ->
        {
              for(int i=1;i<=10;i++)
            {
                c1.increment();
            }
        };
        Runnable th5;
        th5 = () ->
        {
              for(int i=1;i<=10;i++)
            {
                c1.increment();
            }
        };
        Runnable th6;
        th6 = () ->
        {
              for(int i=1;i<=50;i++)
            {
                c1.increment();
            }
        };
        Thread t1 = new Thread(th1,"1st thread");
        Thread t2 = new Thread(th2,"2nd Thread");
        Thread t3 = new Thread(th3,"3rd Thread");
        Thread t4 = new Thread(th4,"4th Thread");
        Thread t5 = new Thread(th5,"4th Thread");
        Thread t6 = new Thread(th6,"4th Thread");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start(); 
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        for(int i=0;i<c1.count;i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        
        
        
    }
    
}
