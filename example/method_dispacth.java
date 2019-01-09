package example;


interface rohan
{
	public void crack();
	
	default void sumup()
	{
		System.out.println("Default Method");
	}
}

abstract class first 
{
	abstract void add();
	
	public void display()
	{
		System.out.println("Inside Parent Class");
	}
	
}

class second extends first implements rohan
{
	
	public void crack()
	{
		System.out.println("Interface");
	}

	void add()
	{
		System.out.println("Inside ADD");
	}
	public void display()
	{
		System.out.println("Inside Child Class");
	}
	
}
public class method_dispacth 
{
	public static void main(String[] args) 
	{
		
		second  s1 = new second();
		s1.add();
		s1.display();
		s1.crack();
		s1.sumup();
//		first f;
//		f = f1;
//		f.display();
//		f = s1;
//		f.display();
		
		
	}
}
