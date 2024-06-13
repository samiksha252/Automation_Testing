package abstract_package;

public class Normal_Class extends  abstract_class  {
	public void login() {
		
		System.out.println("login id");
	}

	public static void main(String[] args) {
		 Normal_Class v= new  Normal_Class();
		v.unit();
		v.calculate();
		v.get();
		v.give();
		v.login();

	}

	@Override
	public void calculate() {
		System.out.println("Calculate Using Arithmatic Operation");
		
	}

	@Override
	public void give() {
		System.out.println("User need to enter password");
		
		
	}

	@Override
	public void get() {
		System.out.println("Stop the Execution");
		
		
	}

}
