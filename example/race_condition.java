package example;

class counter
{
    int count;
    public synchronized void increment()  //After using Synchronized keyword we notice that count value is 2000 as 
                                          //Only one thread is having the control of method at any point of time
    {
//        System.out.println(Thread.currentThread().getName());
        count++;
    }
   
}
public class race_condition 
{
    public static void main(String args[]) throws Exception
    {
        counter c1 = new counter();
        
        Runnable th1;
        th1 = () ->
        {
              for(int i=1;i<=1000;i++)
            {
                c1.increment();
            }
        };
        
        Runnable th2;
        th2 = () ->
        {
              for(int i=1;i<=1000;i++)
            {
                c1.increment();
            }
        };
        Thread t1 = new Thread(th1,"1st thread");
        Thread t2 = new Thread(th2,"2nd Thread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Value of count is(Main Thread) "+c1.count);
        
    }
}
