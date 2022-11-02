package tests;
import java.util.*;

class A implements Comparable<A> {
	A(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int a;
	int b;
	int c;
	
	public int compareTo(A ob) {
		if(this.a==ob.a)
			return 0;
		else if(this.a>ob.a)
			return 1;
		else
			return -1;
	}
	public String toString() {
		return ("a = " + a + " b = " + b + " c = " + c);
	}
}

public class tests4 {

	public static void main(String[] args) {
		
		ArrayList<A> a = new ArrayList<>();
		a.add(new A(20,30,50));
		a.add(new A(40,60,70));
		a.add(new A(10,60,800));
		
		Collections.sort(a);
		for(A b:a)
			System.out.println(b);

	}

}
