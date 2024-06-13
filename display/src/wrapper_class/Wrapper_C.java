package wrapper_class;

public class Wrapper_C {

	public static void main(String[] args) {
		// Convert primitive  datatype into wrapper class 
		 float a = 67.90f;
		 Float r = Float.valueOf(a);
		 System.out.println(r);
		 
		 int t = 78;
		 Integer o = Integer.valueOf(t);
		 System.out.println(o);
		 
		// Convert wrapper class into primitive  datatype  
		 
		 Integer l = new Integer(100);
		 int w = l.intValue();
		 System.out.println(w);
		 
		 
		 
		 
		 
		

	}

}
