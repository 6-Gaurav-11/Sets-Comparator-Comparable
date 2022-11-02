package tests;
import java.util.*;

public class tests2 {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(10);
		h.add(15);
		h.add(2);
		h.remove(2);
		
		System.out.println(h);
		System.out.println(h.hashCode());
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(1);
		t.add(60);
		t.add(49);
		t.add(33);
//		t.add(null);
		t.add(11);
		t.remove(60);
		
		System.out.println(t.descendingSet());
		System.out.println(t.contains(1));
		System.out.println(t);
				
		for(int a:t)
			System.out.print(a + " ");
		System.out.println();
		for(int a:t.descendingSet())
			System.out.print(a + " ");

	}

}
