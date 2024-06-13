package sam_02;

public class Method_Arguments {
	
	int a;
	float r;
	static int c;
	static String b;
	
	public void date(float k) {
		r=k;
		System.out.println(" The value of r is:" +r);
	}
		
	public void std (int h, int n)	{
		a= h;
		c=n;
		System.out.println("The value of a is:" +a);
		System.out.println("The value of c is:" +c);
	}
	
	public static void  function(boolean o, boolean v, String d) {
		boolean x =o ;
		boolean j= v;
		String q =d;
		System.out.println("The value of x is :" +x);
		System.out.println("The value of j is :" +j);
		System.out.println("The value of q is :" +q);
		
		
	}

	public static void main(String[] args) {
		Method_Arguments  ok = new Method_Arguments ();
		
		ok.date(90.89f);
		
		ok.std(25,02);
		
	  function(true, false, "Login");
				
		
		

	}

}
