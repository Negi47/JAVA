package example;

class thread1 implements Runnable{
	thread1(){
//		Thread ob= Thread.currentThread();
		Thread ob = new Thread(this, "child therad");
		System.out.println(Thread.currentThread());
		ob.start();
//		System.out.println(ob);
//		ob.start();
	}
	public void run()
	{
		System.out.println("Thread 1");
	}
}

public class except {
	public static void main(String[] args) {
		
		new thread1();
	}
}
