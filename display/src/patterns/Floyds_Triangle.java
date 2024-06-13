package patterns;

public class Floyds_Triangle {

	public static void main(String[] args) {
		// row =5;column=5
		 int m=1;
		for(int u=1;u<=5;u++) {
			for(int h=1;h<=u;h++) {
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}

