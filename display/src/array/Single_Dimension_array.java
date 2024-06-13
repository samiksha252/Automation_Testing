package array;

public class Single_Dimension_array {

	public static void main(String[] args) {
		// With allocating memory
		
			float[] count = new float[9];
			count[0]=45.90f;
			count[1]=47;
			count[2]=48;
			count[3]=45.78f;
			count[4]=45.79f;
			count[5]=42.25f;
			count[6]=78;
			count[7]=99;
			count[8]=80;
			
			// for each value 
			for(float y: count) {
		    System.out.println(y);
				
		
		
			 //for loop
			for ( int u=0;u<9;u++) {
					System.out.println(" the value is :" +count[u]);
					
				
					
					// to specify length
					System.out.println(" the size of the array is :" +count.length);
					
					 // index value 
					System.out.println("the count of index number is:"+count[0]);
					
					System.out.println("---------------------------------------------");
					
					String [] practice = new String[3];
					practice [0]="manual";
					practice[1]="java";
					practice[2]="Sql";
					
					for(String e: practice) {
						System.out.println(e);
					}
					}
			}
}
}
	




