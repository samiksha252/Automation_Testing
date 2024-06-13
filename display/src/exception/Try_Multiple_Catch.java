package exception;

public class Try_Multiple_Catch {
	
	public void print() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
		} catch(NullPointerException e)	{
		}catch(Exception e) {
	} }

	public static void main(String[] args) {
		Try_Multiple_Catch c1 = new Try_Multiple_Catch();
		c1.print();
		System.out.println("Exception Handle"); 
		
	
		
		

	}

}
