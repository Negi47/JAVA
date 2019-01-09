package example;

class stack{
	public int top = 0;
	public int[] arr= new int[10];
	public void add(int num)
	{
		arr[top] = num;
		top++;
	}
	public void delete()
	{
		top--;
	}
	
	public void display() {
		for (int i = 0; i < top; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class stack_eg extends stack 
{
	public static void main(String[] args) throws Exception
	{
		stack ob = new stack();
		Thread ob1 = new Thread(new Runnable(){
			public void run() {
				ob.add(1);
			}
		});
		Thread ob2 = new Thread(new Runnable() {
			public void run() {
				ob.add(4);
			}
		});
		Thread ob3 = new Thread(new Runnable() {
			public void run() {
				ob.delete();
			}
		});
		ob1.start();
		ob2.start();
		ob3.start();
		ob1.join();
		ob2.join();
		ob3.join();
//		stack_eg o = new stack_eg();
//		
//		System.out.println("Main Thread ");
//		o.display();
		
			
	}
}
