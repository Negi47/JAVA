package example;


class thread3 extends Thread{

	thread3(String str) throws Exception{
	
		super(str);
		start();
		join();
	}
	
	public void run()
	{
		
		int i;
		
		System.out.println("Thread 1 Started");
		for(i=0; i<=10 ; i++)
		{
			if(i%2==0) {
				System.out.println("Even Number are: "+i);
			}
		}
		System.out.println("Thread 1 End\n");
	}
}

class thread2 extends Thread{

	thread2() throws Exception{
	
	super("my thread 2");
	start();
	join();
	}
	public void run() {
		int i;
		System.out.println("Thread 2 Started");
		for(i=1;i<=20;i++) { // (for i=0;i<=10;i+=2) // this also works for odd number
			if(i%2!=0 && i%i==0 && i%3==0) {
				
				System.out.println("Odd Number are: "+i);
			}
		}
		System.out.println("Thread 2 Ended \n");
	}
}
public class thread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new thread3("mythread3");
		new thread2();
		
		
		//Thread t2 = new Thread(new thread2());
		
		//t2.setPriority(10);
		
		//t1.start(); // thread 1 will start
		//t1.join(); // thread 1 will stop thread then only thread 2 will start
		
		//t2.start(); // thread 2 will start
		//t2.join(); // thread 2 will stop  you can interchange to see how it is running
		
	}

}
