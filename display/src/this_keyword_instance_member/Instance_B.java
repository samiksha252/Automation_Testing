package this_keyword_instance_member;

public class Instance_B extends  Instance_A{
	String b="automation";
	public void login() {
		System.out.println(this.b);
		System.out.println(super.b);
		super.login();
		System.out.println("login function");
	}
	public Instance_B () {
		System.out.println(super.b);
		System.out.println("Constructor of child class");
	}
	
	

	public static void main(String[] args) {
		Instance_B  to=new Instance_B();
		to.login();
		
		

	}

}
