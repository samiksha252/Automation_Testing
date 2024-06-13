package sam_02;

public class Default_Values {
	// Integer Data type
	byte a;
	short e;
	int i;
	long o;
	
	//Floating Data type 
	float u;
	double k;
	
	//Non Numeric Data type
	char g;
	boolean m;
	
	// Non primitive Data type
	String y;
	
	

	public static void main(String[] args) {
		Default_Values main=new Default_Values();
		//Integer Data type
		System.out.println("The default value of byte is: " + main.a);
		System.out.println("The default value of short is: " + main.e);
		System.out.println("The default value of int is: " + main.i);
		System.out.println("The default value of long is: " + main.o);
		
		//floating data type
		System.out.println("The default value of float is: " + main.a);
		System.out.println("The default value of double is: " + main.e);
		
		// Non Numeric data type
		System.out.println("The default value of char is: " + main. g);
		System.out.println("The default value of boolean is: " + main. m);
		
		//Non Primitive data type
		System.out.println("The default value of String is: " + main.y);
	
		
	}

}
