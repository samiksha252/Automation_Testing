package patterns;

public class Half_Pyramid_Rectangle_180 {

	public static void main(String[] args) {
		// row=4;column=4
		for(int i=1;i<=4;i++) {
			// to print space 
			for(int r=1;r<=4-i;r++) {
				System.out.print("  ");
			}
			// to print star
			for(int u=1;u<=i;u++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
