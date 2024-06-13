package constructor;

public class Parameter_thiskey {
	// Here we have to use this(); keyword
	
	public Parameter_thiskey (int a) {
		this(67.09f,89,89.09);
		System.out.println("Constructor 1");
	
	}
	public Parameter_thiskey (int b,String d) {
		this(67);
		System.out.println("Constructor 2");
		
	}
	public Parameter_thiskey (String k) {
		this(8,"samiksha");
		System.out.println("Constructor 3");
		
	}
	public Parameter_thiskey (float s,int h, double j) {
		this();
		System.out.println("Constructor 4");
		
	}
	public Parameter_thiskey (float u) {
		this("The value of String k is");
		System.out.println("Constructor 5");
		
	}
	public  Parameter_thiskey() {
		System.out.println("It is User defined");
	}
	public static void main(String[] args) {
		Parameter_thiskey r= new Parameter_thiskey (77.90f);
		
		
		
		
		

	}

}


