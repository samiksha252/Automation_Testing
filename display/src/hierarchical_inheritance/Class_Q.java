package hierarchical_inheritance;

public class Class_Q extends Class_P  {
	public void ok() {
		System.out.println(" Enter a ok");
	}

	public static void main(String[] args) {
		 Class_Q  give = new Class_Q();
		 System.out.println(give.a);
		 give.ok();

	}

}
