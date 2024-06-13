package scanner;

import java.util.Scanner;

public class Switch_block {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number");
		 int w=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int r = sc.nextInt();
		
		System.out.println("Choose any one operator like +,-,*,/");
		char c= sc.next().charAt(0);
		 switch(c) {
		 
		 case '+':
			 System.out.println(" addition of two number is :" +(w+r));
			 break;
			 
		 case '-':
			 System.out.println(" Substraction of two number is :" +(w-r));
			 
		 case '*':
			 System.out.println(" Multiplication of two number is :" +(w*r));
			 
		 case '/':
			 System.out.println(" Division of two number is :" +(w/r));
			 
			 
		 }
		
		
		
	}

}
