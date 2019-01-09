/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class communicate extends Exception
{
    String msg;
    
    synchronized void recive() throws InterruptedException
    {
            System.out.println("Waiting for message ");
            wait();
            System.out.println("Message Recieved by reciever "+msg);
        
    }
    
    synchronized void send(String msg_s) 
    {
        System.out.println("Sending Message.... to reciver ");
        msg = msg_s;
        notify();
    }
}

public class send_recive 
{
    public static void main(String[] args) throws Exception
    {
        
        communicate b1 = new communicate();
        Runnable ob1;
        ob1 = () ->
                {
                    try {
                        b1.recive();
                    } catch (InterruptedException ex) {}
                };
        Thread t1 = new Thread(ob1,"1st Thread");
        t1.start();
        Runnable ob2;
        ob2 = () -> 
                {
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
                Logger.getLogger(send_recive.class.getName()).log(Level.SEVERE, null, ex);
            }
                    b1.send("Go to Class");
                };
        Thread t2 = new Thread(ob2,"2nd  Thread");
        t2.start();
    }
    
}
