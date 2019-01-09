/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

abstract class athlete
{
    String name,sports_id;
  
    athlete(String n, String u)
    {
        name = n;
        sports_id = u;
    }
    
    abstract void get_score();
  
}

class cricket extends athlete
{
  
     String game = "Cricket";
     double performance =  9;

    cricket(String n, String u) 
    {
        super(n, u);
    }
    
    @Override
    void get_score()
    {
        System.out.println("The score for the player out of 10 is: "+performance);
    }
    
 
    void display()
    {
        System.out.println("The name of the student is: "+name);
        System.out.println("The usn of the student is: "+sports_id);
        System.out.println("The stream is: "+game);
    }
}

final class hockey extends athlete
{
    String game = "Hockey";
    double performance =  9;
    
    hockey(String n, String u) 
    {
        super(n, u);
    }
    @Override
    void get_score()
    {
        System.out.println("The score of the player is: "+performance);
    }
    
    void display()
    {
        System.out.println("The name of the athlete is: "+name);
        System.out.println("The idof the athlete is: "+sports_id);
        System.out.println("The game is: "+game);
    }
}   

public class unit_1_final 
{
    public static void main(String[] args) 
    {
       athlete a1;
 
        cricket c1 = new cricket("Poppy","1MS21");
        hockey h1 = new hockey("Jack","1MS22");
        
        a1 = c1;
        c1.display();
        a1.get_score();
        
        
        a1 = h1;
        h1.display();
        a1.get_score(); 
    }
        
}
    
