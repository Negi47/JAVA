/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class counter_1
{
    int count,i;
    int ar[] = new int[7];
    int counter = 1;
    
    void enter_data(int arr[])
    {
        for(i=0;i<7;i++)
            {
                ar[i] = arr[i];
            }
    }
        
    synchronized public void increment()  //After using Synchronized keyword we notice that count value is 2000 as 
                                          //Only one thread is having the control of method at any point of time
    {
        System.out.println(Thread.currentThread().getName());
       if(counter==1)
       {
           for(int i = 0;i<7;i++)
           {
               
               if(i%2==0 && counter==1)
               {
                   System.out.println("Even data "+ar[i]+" is at "+i+" position");
                   counter -= 1;
               }
               else
               {
                   System.out.println("Odd data "+ar[i]+" is at "+i+" position");
                   counter +=1;
               }
               
           }
           
       }
           
    }
   
}

public class odd_even 
{
    public static void main(String args[]) throws Exception
    {
        int arr[] = new int[7];
        Scanner s = new Scanner(System.in);
        
        for(int i=0;i<7;i++)
            {
                arr[i] = s.nextInt();
            }
        
        counter_1 c1 = new counter_1();
        c1.enter_data(arr);
        
        
     Runnable th1;
        th1 = () ->
        {
            
                c1.increment();
        };
        
        Runnable th2;
        th2 = () ->
        {
                c1.increment();
            
        };
        
        Thread t1 = new Thread(th1,"1st Thread");
        Thread t2 = new Thread(th2,"2nd Thread");
        
        t1.start();
        t2.start();
        
        System.out.println("Inside Main Thread ");
    }
    
}
