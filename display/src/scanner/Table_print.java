package scanner;

import java.util.Scanner;

public class Table_print {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter any number");
		 int i=sc.nextInt();
		 
		 System.out.println("your number table is : ");
		 
		 for(int j = 1;j<=10;j++) {
			 System.out.println(i*j);
			 // in table format as 2*1=2;
			 System.out.println(i + "*" + j + "=" + (i*j));
		 }
		

	}

}
