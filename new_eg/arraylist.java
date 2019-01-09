package new_eg;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob = new ArrayList();
		ob.add(1);
		ob.add(2);
		ob.add(2);
		ob.add(4);
		ob.add(1, "hello");
		System.out.println(ob);
		ob.remove(2);
		
		ArrayList ob2 = new ArrayList();
		ob2.add(1);
		ob2.add("hhh");
		
		//int ob[] = new int[5]
		
		System.out.println(ob2);
		
	
		Iterator<Integer> ob1 =ob.iterator(); 
			while(ob1.hasNext())
				System.out.println("List: "+ob1.next());
		
	
	}

}
