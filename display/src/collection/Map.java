package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Map {

	public static void main(String[] args) {
		// Has map 
	HashMap<Integer, String> student = new HashMap<Integer, String>();
	student.put(1,"samiksha");
	student.put(2,"Archana");
	student.put(3,"Prakash");
	student.put(4,"Aswale");
	System.out.println(student);
	
	System.out.println(student.clone());
	System.out.println(student.containsKey(1));
	
	System.out.println("-----------------------------------------");
	
	// LinkedHashmap
	LinkedHashMap<Float, String> sub = new LinkedHashMap<Float, String>();
	sub.put(90.90f,"Manual");
	sub.put(89.90f,"sql");
	sub.put(67.90f,"API");
	sub.put(90.67f,"Automation");
	sub.put(90.56f,"Testing");
	System.out.println(sub);
	System.out.println(sub.clone());
	System.out.println(sub.replace(34.98f,"sql"));
	sub.clear();
	
	
	
	

	}

}
