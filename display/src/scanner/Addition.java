package scanner;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		// to enter first value 
		System.out.println("Enter first value ");
		 int a =t.nextInt();
		 
		 // to enter second value
		 System.out.println("Enter second value");
		 int b =t.nextInt();
		 
		 // addition of a and b
		 int  c=a+b;
		 System.out.println("The addition of a and b is : "+c);
		  

	}

}
