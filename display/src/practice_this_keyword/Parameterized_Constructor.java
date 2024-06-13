package practice_this_keyword;

public class Parameterized_Constructor {
	
	public  Parameterized_Constructor(int a,int b) {
	      this(23,67.90f,"samiksha");
		System.out.println("constructor 1");
	}
	public  Parameterized_Constructor(String h) {
		this(02,25);
		System.out.println("constructor 2");
	}

	public  Parameterized_Constructor(float y,double q) {
		this("India");
		System.out.println("constructor 3");
	}

	public  Parameterized_Constructor(int s,float x,String l) {
		System.out.println("constructor 4");
	}

	public  Parameterized_Constructor(int w) {
		this(89.88f,34.90);
		System.out.println("constructor 5");
	}


	public static void main(String[] args) {
		Parameterized_Constructor get = new Parameterized_Constructor(800);
    


	}

}
