package sam_02;

public class String_Split {
	
	public static void main(String[] args) {
		
		String s = "Samiksha has emailid  samikshaaswale@gmail.com";
		
		String[] w= s.split(" ");
		System.out.println(w[0]);
		System.out.println(w[1]);
		System.out.println(w[2]);
		System.out.println(w[3]);
		System.out.println(w[4]);
		
	}

}
