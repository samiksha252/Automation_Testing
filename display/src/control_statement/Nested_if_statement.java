 package control_statement;

     public class Nested_if_statement {

	public static void main(String[] args) {

	     //In this two condition is true

		int a=100;
	
		if(a<90) {
			System.out.println("a is less than 90");
		}
		if(a>70) {
			System.out.println("a is greater than 70");
		}
		if(a==100) {
			System.out.println("a is equals to 100");
		}
		else {
			System.out.println("all the above condition are true");
		}
		System.out.println("----------------------------------------");
		
		//In this all condition is false then else statement is executed
		
		if(a<90) {
			System.out.println("a is less than 90");
		}
		if(a<70) {
			System.out.println("a is less than 70");
		}
		if(a==70) {
			System.out.println("a is equals to 70");
		}
		else {
			System.out.println("else condition is executed");
		}
		System.out.println("----------------------------------------");
		
		//In this all condition is true
		
		if(a>90) {
			System.out.println("a is greater than 90");
		}
		if(a==100) {
			System.out.println("a is equals to 100");
		}
		if (a<200) {
			System.out.println("a is less than 200 ");
		}
		else {
			System.out.println("else condition is executed");
		}
		
	   }

      }