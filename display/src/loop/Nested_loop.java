package loop;

public class Nested_loop {

	public static void main(String[] args) {
		for(int k=1;k<=10;k++) {
			System.out.println("The value of outer loop is: " + k);
			for( int o=1;o<=4;o++) {
				System.out.println(o);
			}
		}

	}

}
