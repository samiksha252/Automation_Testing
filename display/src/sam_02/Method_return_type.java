package sam_02;

public class Method_return_type {

	// 1) Without Return Type and no parameters
	public void xyz() {
		System.out.println("Manual");
	}
	// 2) Without Return Type and With Parameter
	
	public static void name(String API) {
	System.out.println("Automation");
	}
	
    // 3) With Return Statement and Parameters
	public void pqr(int s) {
		System.out.println(s);
		return;
	}
	
	// 4) With Return Type and Having Parameter
	public int add(int r,int t) {
		return r+t ;
	}

	public static void main(String[] args) {
		Method_return_type j= new Method_return_type();
		j.xyz();
		System.out.println("--------------------------------------");
		name("sql");
		System.out.println("--------------------------------------");
		j.pqr(50);
		System.out.println("--------------------------------------");
		System.out.println(j.add(60, 40));
	
	

	}

}
