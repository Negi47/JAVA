package thirdinternal;

interface adin {
	int add(int a[]);
}

public class lamda {


	public static void main(String[] args) {

		 adin ad = (arr) -> {
		 	int sum=0;
		 	for(int i:arr) {
		 		sum += i;
		 	}

		 	return sum;
		 };
		

		adin print = (arr) -> {
			for (int i:arr) 
				System.out.println(i);

			return 1;
		};


		int a[] = {1,2,3,4,5};
		

		print.add(a);
		System.out.println(ad.add(a));

	}
}