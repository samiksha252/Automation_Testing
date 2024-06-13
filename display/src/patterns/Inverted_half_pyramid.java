package patterns;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
		for(int m=5;m>=1;m--) {
			for(int n=1;n<=m;n++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
