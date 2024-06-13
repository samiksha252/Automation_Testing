package sam_02;

public class Instance_Var {
	
	int v=90; 
	
	
	public void division() {
		// we can access instance variable directly in the instance method.
		System.out.println("the value of v from division method"+ v);
	}
	public static void sum() {
		// to access instance variable in static method we need to create object
		Instance_Var sum =new Instance_Var();
		System.out.println(sum.v);
	}

	public static void main(String[] args) {
		
		Instance_Var e=new Instance_Var();
		
		//Instance Variable with the help of reference variable
		System.out.println("the value of h instance variable "+e.v);
		
		// Instance Method
		e.division();
		
		//static method
		sum();
		
	      
		

	}

}
