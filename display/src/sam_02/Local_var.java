package sam_02;

 public class Local_var {
	
	public void Data() {
	
		int s=25;
		System.out.println(s);
	}
	public static void display() {
		float y= 67.90f;
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		
     Local_var w = new Local_var();
	 w.Data();
	 System.out.println("---------------------------------");
	 
	 display();
	 
	}
	
}
