/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.logging.Level;
import java.util.logging.Logger;

interface operations
{
    public void deposit(int n);
    public void withdraw(int m);
    public void display();
}
public class intr_ban extends Exception implements operations
{
    int balance = 1000;
   
    
    @Override
    public void deposit(int n)
    {
        
        balance += n;
        System.out.println("Balance after deposit is: "+balance);
    }
    
    @Override
    public void withdraw(int m)
    {
        if (balance<10000)
        {
            try {
                throw new intr_ban();
            } catch (intr_ban ex) {
                System.out.println(ex+" This Exception was thrown due to insufficient balance, Hence unable to withdraw ");
            }
        }
        else
        {
            balance -= m;
            System.out.println("Balance after withdrwal is: "+balance);
        }
        
    }
    
    @Override
    public void display()
    {
        if (balance<8000)
        {
            try {
                throw new intr_ban();
            } catch (intr_ban ex) {
                System.out.println("This Exception was thrown due to less than limit balance balance: "+balance);
            }
        }
        else
        {
             System.out.println("Current balance is: "+balance);
        }

    }
    public static void main(String[] args) 
    {
        intr_ban b1 = new intr_ban();
        try
        {
            b1.display();
            b1.deposit(1000);
            b1.withdraw(7000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}
