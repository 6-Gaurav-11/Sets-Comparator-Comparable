package tests;
import java.util.*;

class Z {
	Z(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int a;
	int b;
	int c;
	
	public String toString() {
		return ("a = " + a + " b = " + b + " c = " + c);
	}
}
public class tests5 {

	public static void main(String[] args) {
		ArrayList<Z> arr = new ArrayList<>();
		arr.add(new Z(19,34,15));
		arr.add(new Z(3,45,7));
		arr.add(new Z(16,72,2));
		
		Comparator<Z> a_cmp = new Comparator<>() {
			public int compare(Z a1, Z a2) {
				if(a1.a == a2.a)
					return 0;
				else if(a1.a > a2.a)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(arr, a_cmp);
		for(Z a:arr)
			System.out.println(a);
			System.out.println();
		
		Comparator<Z> b_cmp = new Comparator<>() {
			public int compare(Z a1, Z a2) {
				if(a1.b == a2.b)
					return 0;
				else if(a1.b > a2.b)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(arr, b_cmp);
		for(Z a:arr)
			System.out.println(a);
			System.out.println();
		
		Comparator<Z> c_cmp = new Comparator<>() {
			public int compare(Z a1, Z a2) {
				if(a1.c == a2.c)
					return 0;
				else if(a1.c > a2.c)
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(arr, c_cmp);
		for(Z a:arr)
			System.out.println(a);

	}

}