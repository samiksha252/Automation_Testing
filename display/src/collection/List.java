package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// Arraylist
		
		// for Integer
		 ArrayList<Integer> rollno = new ArrayList<Integer>();
		 rollno.add(0);
		 rollno.add(null);
		 rollno.add(1);
		 rollno.add(2);
		 rollno.add(3);
		 rollno.add(4);
		 
		 rollno.add(0,78);
		 
		 System.out.println(rollno.contains(3));
		 System.out.println(rollno.clone());
		 
		 System.out.println(rollno);
		 System.out.println(rollno.isEmpty());
		 rollno.remove(3);
		 System.out.println(rollno); 
		 
		 System.out.println("----------------------------------");
		 // For String
		 ArrayList<String> name1  = new ArrayList<String>();
		 name1.add(0, null);
		 name1.add(1, "Samiksha");
		 name1.add(2, "Shreya");
		 name1.add(3, "Mitali");
		 name1.add(4, "Mugdha");
		 
		System.out.println(name1.size());
		System.out.println(name1);
		System.out.println(name1.clone());
		name1.remove(0);
		System.out.println(name1);
		 
		 System.out.println("----------------------------------------");
		 
		 // LinkedList
		 
		 LinkedList<Character> name = new LinkedList<Character>();
		 name.add('r');
		 name.add('a');
		 name.add('n');
		 name.add('i');
		 System.out.println(name);
		 System.out.println(name.pollFirst());
		 System.out.println(name.pollLast());
		 System.out.println("-------------------------------------");
		 System.out.println(name.peekFirst());
		 System.out.println(name.peekLast()); 
		 
		
		

	}

}
