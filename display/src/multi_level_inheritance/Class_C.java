package multi_level_inheritance;

public class Class_C extends Class_B {
	public static void username() {
		System.out.println("Enter the  Username");

	}

	public static void main(String[] args) {
		Class_C o = new Class_C();
		System.out.println(o.u);
		o.login();
		o.username();
	}

}
