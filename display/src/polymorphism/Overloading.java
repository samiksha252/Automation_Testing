package polymorphism;

public class Overloading {
	public void School() {
		System.out.println("The School Method without parameters");
		
	}
	public void School(int a) {
		System.out.println(" The School Method with int parameter");
	}
	public void School(int v,String h) {
		System.out.println("The School method with Two parameters");
	}
	public void School(String k,float d, int w,int y) {
		System.out.println("The School method with Four parameters");
	}
	
		
		
public static void main(String[] args) {
	Overloading u = new Overloading();
	u.School();
	u.School(0);
	u.School(4,"samiksha");
	u.School("Shreya", 45.90f,6, 90);
	
}		

	}


