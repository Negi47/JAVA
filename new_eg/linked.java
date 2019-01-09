package new_eg;

import java.util.*;

public class linked {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob = new LinkedList();
		ob.add("1");
		ob.add("2");
		ob.add("2");
		ob.addFirst("4");
		ob.add(2, "hi");
		ob.addLast("bye");
		ob.removeLast();
		
		Collection ob1 = new LinkedList();
	
		ob1.add("helo");
		
		ob.addAll(ob1);
		
		System.out.println(ob);
		
		ob.remove("1");
		
		System.out.println(ob);
		
		//ob.add('a');
		
		//int ob[] = new int[5];
		
//		Iterator<Integer> ob1 =ob.iterator(); 
//			while(ob1.hasNext())
//				System.out.println("List: "+ob1.next());
		
	}

}
