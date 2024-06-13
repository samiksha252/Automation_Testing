package sam_02;

public class Methods {
	float n=90.87f;
	
	// instance method
	public void manual() {
		int b=9;
		System.out.println(b);
	
		float L=7869.098f;
		System.out.println(L);
		
	}
	
	 // Static Method
	public static void Design() {
		System.out.println("API");
		System.out.println("Database");
	}
	

	public static void main(String[] args) {
		//This is object [class name ref_variable=new class name ();]
	 Methods d= new Methods();
	 //To access Instance Method (reference_variable.methodname)
	 System.out.println(d.n);  
	 
	d.manual();
	 // To access Static Method(method_name)
	 Design();
	 //(Classname.methodname)
	 Methods.Design();
	}
}