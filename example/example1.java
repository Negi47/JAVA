package example;

class alpha{
	int a=10;
	int b=0;
	int c=0;
	int[] ab= new int[10];
	
	public void cal() {
		try {
			//c=a/b;
			ab[20]=21;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Default Catch: "+e);
		}
		finally{
			System.out.println("This is Executed");
		}
	}
}
public class example1 {
public static void main(String[] args) {
	alpha ob =new alpha();
	ob.cal();
}
}
