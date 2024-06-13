package sam_02;

public class Static_Var {
	// We can access static variable directly in the instance method as well as in static method
	static float t =78.09f;
	
	public void Design() {
		System.out.println(t);
	}
	
	public static void num() {
		System.out.println(t);
	}

	public static void main(String[] args) {
		Static_Var d= new Static_Var();
		d.Design();
		
	   //System.out.println(t);
       
        //System.out.println(Static_Var.t);
        //num();
	}

}
