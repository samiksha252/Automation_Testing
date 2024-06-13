package practice;

public class Mock {
	
	public   Mock () {
		this(45);
		System.out.println("constructor 1");
		
	}
	
	public  Mock (int a) {
		this("samiksha",78);
		System.out.println("constructor 2");
		
	}
	public   Mock ( String e, int g) {
		System.out.println("constructor 3");
		
	}

	public static void main(String[] args) {
	Mock r = new  Mock();
		

	}

}
