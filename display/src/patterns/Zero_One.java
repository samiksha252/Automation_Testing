package patterns;

public class Zero_One {

	public static void main(String[] args) {
		// row=5;column=5
		for(int a=1;a<=5;a++) {
			for(int c=1;c<=a;c++) {
				int y=a+c;
				if(y%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
		
	}

	}
	


