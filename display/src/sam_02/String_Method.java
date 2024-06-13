package sam_02;

public class String_Method {
	//Methods in String Class
	char z=4;
		
	public static void main(String[] args) {
		//1)is empty
		 String name= "Indian Economy";
		 name.isEmpty();
		 System.out.println(name.isEmpty());
		 System.out.println("--------------------------------------");
		 String s=" ";
		 System.out.println(s.isEmpty());
		 System.out.println("--------------------------------------");
		 
		 //2)Length
		 System.out.println(name.length());
		 System.out.println("--------------------------------------");
		 
		 //3)Replace
		 String x="Indian Economy";
		 System.out.println(x.replace("Economy","Policy"));
		 System.out.println("--------------------------------------");
		 
		 //4)Index of
		 System.out.println(name.indexOf("d"));
		 System.out.println("--------------------------------------");
		 
		 //5)Char at
		 String z="Automation";
		 System.out.println(z.charAt(4));
		 System.out.println("--------------------------------------");
		 
		 //6) Substring
		 System.out.println(name.substring(6));
		 System.out.println(name.substring(0, 5));
		 System.out.println("--------------------------------------");
		 
		 //7)  concatination
		 String w="Manual";
		 System.out.println(w.concat(" Testing"));
		 System.out.println("--------------------------------------");
		 
		 //8) to lower case
		 String ok="Samiksha";
		 System.out.println(ok.toLowerCase());
		 System.out.println("--------------------------------------");
		 
		 //9) to Upper case
		 String y="Samiksha";
		 System.out.println(y.toUpperCase());
		 System.out.println("----------------------------------");
		 
		 //10)  Contains
		 String v= "Waterfall model is outdated model";
		 System.out.println(v.contains("model"));
		 System.out.println("-----------------------------------");
		 
		 //11)equals
		 String e= "Samiksha";
		 String g= "Samiksha";
		 System.out.println(e.equals(g));
		 System.out.println("-----------------------------------");
		 
		 //12)equals in ignore case
		 String r="API";
		 String f="api";
		 System.out.println(r.equalsIgnoreCase(f));
		 System.out.println("-----------------------------------");
		 
		 //13) ends with method
		 String t="Agile Model is Mostly Used Model";
		 System.out.println(t.endsWith("Mostly Used Model"));
		 System.out.println("-----------------------------------");
		 
		 //14)Trim
		 String A="    Samiksha  Aswale    ";
		 System.out.println(A.trim());
		 System.out.println("-------------------------------------------");
		 
		 
		 
		 
	}
		 
}


