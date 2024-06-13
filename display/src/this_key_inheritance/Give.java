package this_key_inheritance;

public class Give {
	String g= "java";
	
	
	public void username() {
		System.out.println("Verfy username");
	}
	public Give () {
	    System.out.println(this.g);
	    this.username();
		System.out.println("It is User defined");
		
	}

	public static void main(String[] args) {
		Give h = new Give();
		
		

	}

}
