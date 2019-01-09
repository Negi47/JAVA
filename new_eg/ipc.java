package new_eg;

class bank {
	
	int balance = 1000;
	
	synchronized void withdraw() throws InterruptedException{
		int i=10000;
		
		if(i > balance) {
			System.out.println("t1 inside wait");
			wait();
			
		}
		balance = balance - i;
		
		System.out.println("Balance: "+balance);
		
	}
	
	synchronized void deposit() throws Exception {
//		int e=100;
		balance = balance + 100;
		System.out.println("Balance2: "+balance);
		notify();
	}
}

public class ipc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		bank ob = new bank();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					ob.withdraw();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
				}
			}
		});		
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					ob.deposit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
		});
		
		
		t1.start();
//		t1.join();
		
		t2.start();
		t2.join();
		
		
		System.out.println("Main therad ");
	}
}
