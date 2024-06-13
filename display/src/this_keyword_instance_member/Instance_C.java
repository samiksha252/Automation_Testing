package this_keyword_instance_member;

public class Instance_C extends Instance_B {
	int a= 45;
	static float h = 67.90f;
	String d= " manaul";
	public void search() {
		System.out.println(this.a);
		System.out.println(this.h);
		System.out.println(this.d);
		System.out.println("Search functionality");
	}
	public void write() {
		this.search();
		this.login();
		System.out.println(this.b);
		System.out.println("write the value");
	}
	

	public static void main(String[] args) {
		Instance_C  j= new Instance_C();
		j.write();
		
		
		

	}

}
