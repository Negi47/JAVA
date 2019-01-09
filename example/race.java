package example;

class mycounter
{
    int count;
    public void increment()  //After using Synchronized keyword we notice that count value is 2000 as 
                                          //Only one thread is having the control of method at any point of time
    {
//        System.out.println(Thread.currentThread().getName());
        count++;
    }
   
}


class prod extends Thread {
	mycounter c = new mycounter();
	int a;
	
	prod() {
		System.out.println("prod constructer");
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
		
			}
		}
	}



public class race {
	
	public static void main(String[] args) throws Exception {
		
		
		mycounter c = new mycounter();
		
		prod p = new prod();
		
		Thread t1 = new Thread(p, "prod thread");
		t1.start();
//		p.join();
//		Thread.sleep(1000);
		System.out.println("Main thread " + c.count);
		
	
		
	}

}
