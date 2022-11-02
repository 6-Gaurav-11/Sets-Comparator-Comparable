package tests;
import java.util.*;

public class tests3 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> h = new HashMap<>();
		h.put(1, 5);
		h.put(null, 6);
		h.put(3, 10);
		h.put(4, 98);
		h.put(5, 66);
		h.put(6, 49);
		
		System.out.println(h.entrySet());
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		TreeMap<Integer, Integer> t = new TreeMap<>();
		t.put(1, 24);
		t.put(2, 21);
		t.put(3, 66);
		t.put(4, 54);
		t.put(5, 32);
		t.put(6, null);
		
		System.out.println(t.entrySet());
		System.out.println(t.descendingMap());

	}

}
