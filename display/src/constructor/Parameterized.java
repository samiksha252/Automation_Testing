package constructor;

public class Parameterized {
	public Parameterized(int a,int y,int r) {
		System.out.println("It is parameterized constructor");
		System.out.println(" the first value is:"+ a);
		System.out.println(" the second  value is:"+ y);
		System.out.println(" the  third  value is:"+ r);
		
	}

	public static void main(String[] args) {
		Parameterized f = new Parameterized( 23, 67,78);
		
	}

}
