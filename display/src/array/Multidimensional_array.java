package array;

public class Multidimensional_array {

	public static void main(String[] args) {
		// by allocating memory
		int[][] roll_no=new int [2][2];
		roll_no[0][0]=5;
		roll_no[0][1]=4;
		
		roll_no[1][0]=8;
		roll_no[1][1]=9;
		// to print all the values
		for(int a=0;a<2;a++) {
			for(int j=0;j<2;j++) {
				System.out.print(roll_no[a][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		// for index
		 System.out.println(roll_no[0][1]);
		 

		 
		
		}
	
		
	

	}

