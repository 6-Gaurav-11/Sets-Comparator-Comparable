package tests;
import java.util.*;

public class test1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a);
		
		LinkedList<Integer> b = new LinkedList<>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		b.addFirst(7);
		b.pollLast();
		b.remove(0);
		Collections.sort(b, Collections.reverseOrder());
		System.out.println(b);
		System.out.println(b.get(4));
		
		
	}

}
