package new_eg;

class gen<t,t1>
{
	t a;
	t1 b;
	
	gen(t ab,t1 ba){
		a = ab;
		b = ba;
	
	}
	  public void add() {
		
		System.out.println(a+ " " +b);
		
	}
}
public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen<Character, Integer> ob =new gen<Character, Integer>('a', 20);		
		ob.add();
	}

}
