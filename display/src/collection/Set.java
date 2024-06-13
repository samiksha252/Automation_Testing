package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class Set {

	public static void main(String[] args) {
		// HashSet
		HashSet<Float> abc = new HashSet<Float>();
		abc.add(77.90f);
		abc.add(56.90f);
		System.out.println(abc);
		System.out.println(abc.contains(77.90f));
		System.out.println(abc.clone());
		abc.clear();
		System.out.println(abc);
		
		System.out.println("---------------------------------");
		
		// LinkedHashset
		LinkedHashSet<Integer> pqr = new LinkedHashSet<Integer>();
		pqr.add(77);
		pqr.add(99);
		pqr.add(70);
		pqr.add(89);
		pqr.add(33);
		System.out.println(pqr);
		System.out.println(pqr.clone());
		
		
		
		

	
		
		

	}

}
