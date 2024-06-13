package constructor;

public class Desc_Constructor {

	// user defined constructor
	
	public Desc_Constructor (){
		System.out.println("User Defined Constructor");
		
	}
	
	// Parameterized Constructor
	
	public Desc_Constructor(int a,int b) {
		System.out.println("Parameterized Constructor");
		System.out.println("The value of a="+ a);
		System.out.println("The value of b="+ b);
	
	}
	
	 public static void main(String[] args) {
		// object is create for User Defined Constructor
		Desc_Constructor r= new Desc_Constructor();
		
		// object is create for parameterized constructor and in parenthesis we have to pass parameters
		Desc_Constructor g = new Desc_Constructor(34,90);
		
	
		

	}

}
