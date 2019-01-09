package new_eg;

enum week{
	mon(20),tue(20),wens(30),thur(40);
	
	int price;
	
	week(int p){
		price=p;
	}
	
	int get() {
		return price;
	}
}

public class enumex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week ob,ob1,ob3;

		
		week all[]=week.values();
		
		for(week a : all)
		{
			System.out.println(a+": "+a.ordinal());
		}
		
		ob  = week.mon;
		ob1 = week.tue;
		ob3 = week.thur;
		
		System.out.println("cpmpare to : " + ob1.compareTo(ob3));
		
		if(ob1.equals(ob) )
		{
			System.out.println("compared");
		}
		else
		{
			System.out.println("not compared");
		}
		
		System.out.println("1 ob: "+week.mon.get());
		
		ob = week.valueOf("tue");
		
		if(ob == week.tue) {
			System.out.println("value: "+ob);
		}
		
	}

}
