package example;

class counte{
	int count;
	public synchronized void increment() {
		count++;
	}
}


public class sync {
	public static void main(String[] args) throws Exception {
		counte ob =new counte();
		Thread t1= new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					ob.increment();
				}
			}
		});
		Thread t2= new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					ob.increment();
				}
			}
		});	
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(ob.count);
	}
}
