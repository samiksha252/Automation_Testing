package loop;

public class While_loop {

	public static void main(String[] args) {
		// forward condition 25 to 50
		int j=25;
		while(j<=50){
		System.out.print(j+" ");
		j++;
		}
	
	   System.out.println(" ");
	   System.out.println("--------------------------------------");
	   System.out.println(" ");
	   
	   //Reverse condition  75 to 25
	   int h=50;
		while(h>=25){
		System.out.print(h+" ");
		h--;
		}
		
		   System.out.println(" ");
		   System.out.println("--------------------------------------");
		   System.out.println(" ");
		   
		
		// Even  number 
		
		int d=0;
		while(d<=50) {
			if(d%2==0) {
		System.out.print(d+" ");
		}
		d++;
		}
		   System.out.println(" ");
		   System.out.println("--------------------------------------");
		   System.out.println(" ");
		
		// odd number

		int x=0;
		while(x<=50) {
			if(x%2!=0) {
		System.out.print(x+" ");
		}
		x++;
		}
		   System.out.println(" ");
		   System.out.println("--------------------------------------");
		   System.out.println(" ");
		
		// even number without using if statement
		
		int z=0;
		while(z<=25) {
			System.out.print(2*z+" ");
			z++;
		}

		   System.out.println(" ");
		   System.out.println("--------------------------------------");
		   System.out.println(" ");
		
		   // odd number without using if statement
		   int m=0;
			while(m<=25) {
				System.out.print((m*2+1)+" ");
				m++;
			}
			   System.out.println(" ");
			   System.out.println("--------------------------------------");
			   System.out.println(" ");
			
			
			// to print the table 2
			   int v=1;
			   while(v<=10) {
				   System.out.print(2*v+" ");
				   v++;
			   }
			   System.out.println(" ");
			   System.out.println("--------------------------------------");
			   System.out.println(" ");
			
			   
			   //  table 3*1=3
			     //      3*2=6
			   
			   int f=1;
			   while(f<=10){
				   System.out.println("3*"+f+"="+(3*f));
				   f++;
			   }
			}
		
		
		
	}
	
	
	
	
	   

	


