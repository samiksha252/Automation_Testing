package dt_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		Date s = new Date();
		System.out.println(s.toString());
		
		System.out.println("-----------------------------");
		
		// Customize Date 
		
		SimpleDateFormat u = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		System.out.println(u.format(s));
		
		System.out.println("-------------------------------");
		
		SimpleDateFormat l = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(l.format(s));
		
		System.out.println("-----------------------------------");
		
		SimpleDateFormat j = new SimpleDateFormat("hh:mm:ss");
		System.out.println(j.format(s));
		
		

	}

}
