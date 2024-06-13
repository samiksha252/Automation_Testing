package scanner;

import java.util.Scanner;

public class String_s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the value of h");
	    String h = sc.nextLine();
	    
	System.out.println("Enter the value of u ");    
		String u = sc.nextLine();
		
		System.out.println(" The output is as follows : ");
		String i=h.concat(u);
		
		System.out.println(" The name of instute is:"  + i);
		
		 
	}

}
