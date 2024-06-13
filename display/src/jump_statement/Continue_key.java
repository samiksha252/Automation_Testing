package jump_statement;

public class Continue_key {

	public static void main(String[] args) {
	     // For loop
		//increment
		for(int z=1;z<=10;z++) {
			if(z==6) {
				continue;
			}
			System.out.print(z+" ");
			}
		System.out.println();
		System.out.println("-------------------------------------------");
		
		// decrement
		for(int k=20;k>=1;k--) {
			if(k==13) {
				continue;
			}
			System.out.print(k+" ");
			}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		// While loop
		//increment
		int  p=0;
		while(p<=35) {
			p++;
			if(p==20) {
				continue;
			}
			System.out.print(p+" ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		   // decrement
		int  i=50;
		while(i>=45) {
			i--;
			if(i==47) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		// Do while loop
		//increment
		int j=0;
		do {
			j++;
			if(j==5) {
				continue;
			}
			System.out.print(j+" ");
		}while(j<=10);
		System.out.println();
		System.out.println("------------------------------------------------");
		
		// decrement
		int v=80;
		do {
			v--;
			if(v==70) {
				continue;
			}
			System.out.print(v+" ");
		}while(v>=60);
		System.out.println();
		
			}
          
		
		}

	


