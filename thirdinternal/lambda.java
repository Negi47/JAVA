package thirdinternal;

interface add{
	 int sum(int a,int b);
}
public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add ob = (a,b) -> {
//			return (a+b);
//			};
		add ob = (a,b) -> a+b;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			System.out.println("The sum: "+ob.sum(a,b));
		}
	}

