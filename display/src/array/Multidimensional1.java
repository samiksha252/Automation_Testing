package array;

public class Multidimensional1 {

	public static void main(String[] args) {
	// without allocating memory
		//datatype [][] arrayname={value 1, value 2};
		 int[][] list= {{2,3,3},{3,6,8},{3,9,8}};
		 for(int l=0;l<3;l++) {
			 for(int y=0;y<3;y++) {
				 System.out.print(list[l][y]+" ");
			 }
			 System.out.println();
			 
		 }
		 System.out.println("------------------------------------------------");
		 System.out.println(list[0][1] );
		

	}

}
