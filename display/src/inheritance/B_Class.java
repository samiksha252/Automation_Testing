package inheritance;

public class B_Class extends A_Class {

	int l = 90;

	public static void main(String[] args) {
		// Is a relationship
		B_Class u = new B_Class();
		System.out.println(u.a);
		u.get();
		System.out.println(u.l);

	}

}
