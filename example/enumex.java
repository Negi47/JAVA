package example;

enum apple{
	hello(10), myname(20), bye(30), jonny(40), yes(50), papa(60);
	
	int price;
//	apple()
//	{
//		price =-1;
//	}
	apple(int p)
	{
		price = p;
	}
	int get() {
		return price;
	}
}
public class enumex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple ob;
		
		System.out.println("Price: "+apple.myname.get());
		
		apple ob1[]= apple.values();
		
		for(apple o :ob1)
		{
			System.out.println("Values" +o.ordinal());
		}
		
//		for(apple o : ob1)
//		{
//			System.out.println(o+" "+o.get());
//		}
		
		ob= apple.myname;
		
		if(ob == apple.myname)
		{
			System.out.println("its der");
		}
		else
		{
			System.out.println("its not der");
		}
		ob = apple.valueOf("myname");
		System.out.println("value of: "+ob);
	}

}
