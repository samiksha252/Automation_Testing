package patterns;

public class Hallow_rectangle {

	public static void main(String[] args) {
		for( int t=1;t<=4;t++) {
			for(int r=1;r<=5;r++) {
			 if(t==1 ||t==4|| r==1||r==5) {
				 System.out.print("* ");
			 }else {
				 System.out.print("  ");
			 }
			}
			System.out.println();
		}

	}

}
