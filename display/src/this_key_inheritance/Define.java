package this_key_inheritance;

public class Define extends Give {
	int a = 90;
	float k = 67.90f;
	static int r = 56;

	public void set() {
		System.out.println(this.a);
		System.out.println(this.k);
		System.out.println(this.r);
		System.out.println("Set function");
	}
	public void line() {
		this.username();
		System.out.println(this.g);
		this.set();
		System.out.println("print the line");
	}

	public static void main(String[] args) {
		Define u = new Define();
		u.line();
	}

}
