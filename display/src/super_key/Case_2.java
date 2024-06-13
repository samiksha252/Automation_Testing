package super_key;

public class Case_2 extends Case_1 {
	int p = 99;
	float k = 89.88f;
	String l = "sql";

	public void function() {
		System.out.println(this.p);
		System.out.println(this.k);
		System.out.println(this.l);
		System.out.println("The function method");

		System.out.println(super.p);
		System.out.println(super.k);
		System.out.println(super.l);
		super.function();
		this.cust();
	    
	}
	public Case_2() {
		super( 99,90 );
		System.out.println("User defined constructor of child class");
	}
	

	public static void main(String[] args) {
		 Case_2 k = new  Case_2();
		 k.function();
		 
		

	}

}
