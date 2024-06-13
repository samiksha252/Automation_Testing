package jump_statement;

public class Break_keyword {

	public static void main(String[] args) {
		// For loop
		// Increment
		for(int a=1;a<=15;a++) {
			System.out.print(a+" ");
			if(a==5) {
				break;
			}
		}
		System.out.println();
		
		System.out.println("-------------------------------------");
		// Decrement 
		for(int n=30;n>=1;n--) {
			System.out.print(n+" ");
			if(n==5) {
				break;
			}
		}
		System.out.println();
		
		System.out.println("--------------------------------");
		// While Loop
		// increment
		int r=1;
		while(r<=10) {
			System.out.print(r+" ");
			if(r==6){
			break;
			}
		}
			r++ ;
			System.out.println("---------------------------------------------");
			
			// Decrement
			int m=20;
			while(m>=10) {
				System.out.print(m+" ");
				if(m==15){
				break;
				}
			}
				m-- ;
			System.out.println("------------------------------------------------------");
			// Do While
			// increment
			int d= 1;
			do {
				System.out.print(d+" ");
				if(d==7) {
					break;
				}
				d++;
			} while(d<=20);
			System.out.println();
			System.out.println("-------------------------------------------------");
			
				// decrement
			int  y= 20;
			do {
				System.out.print(y+" ");
				if(y==8) {
					break;
				}
				y--;
			} while(y>=1);
			System.out.println();
			System.out.println("-------------------------------------------------");
			
			}
		}




