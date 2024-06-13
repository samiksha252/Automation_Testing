package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
           // Throws 
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f = new FileInputStream("Path of file");
		
		// Try Catch Block
		
		try {
			FileInputStream h = new FileInputStream("Path of file");
		
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		

	}

}
