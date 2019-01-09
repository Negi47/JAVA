/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;

abstract class student
{
    String name,usn;
  
    student(String n, String u)
    {
        name = n;
        usn = u;
    }
    
    abstract void get_cgpa();
  
}

class be extends student
{
  
     String stream = "B.E";
     double cgpa =  8.8;

    be(String n, String u) 
    {
        super(n, u);
    }
    
    @Override
    void get_cgpa()
    {
        System.out.println("The cgpa for the student is: "+cgpa);
    }
    
 
    void display()
    {
        System.out.println("The name of the student is: "+name);
        System.out.println("The usn of the student is: "+usn);
        System.out.println("The stream is: "+stream);
    }
}

final class mca extends student
{
    String stream = "M.C.A";
    double cgpa =  9.8;
    
    mca(String n, String u) 
    {
        super(n, u);
    }
    @Override
    void get_cgpa()
    {
        System.out.println("The cgpa for the student is: "+cgpa);
    }
    
    void display()
    {
        System.out.println("The name of the student is: "+name);
        System.out.println("The usn of the student is: "+usn);
        System.out.println("The stream is: "+stream);
    }
    
}
public class unit_1 
{
    public static void main(String[] args) 
    {
        student s1;
 
        be b1 = new be("Poppy","1");
        mca m1 = new mca("Jack","2");
        
        s1 = b1;
        b1.display();
        s1.get_cgpa();
        
        
        s1 = m1;
        m1.display();
        s1.get_cgpa();
        
     }
    
}
