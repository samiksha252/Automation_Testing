package sam_02;

public class Logical_Operator {

	public static void main(String[] args) {
		
		//Logical and(&&)
		//When Both Condition are True then True, otherwise false
		int g=800;
		int k=900;
		boolean r =g<k && g>k ;
		System.out.println(r);
		System.out.println("--------------------------------------");
		
		//Logical OR(||)
		//When any of the condition Specified True
		short s=400;
		short q=300;
		boolean m= s==q || s<q;
		System.out.println(m);
		System.out.println("--------------------------------------");
		
		//Logiacl Not(!)
		//It reverse the value
		int o=100;
		System.out.println(!(o<500));
		

	}

}
