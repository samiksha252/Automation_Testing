package interface_package;

public class Interface_Normal_Class implements Interface_1{

	public static void main(String[] args) {
		Interface_Normal_Class o = new Interface_Normal_Class();
		o.acept();
		o.guess();
		
	
	}

	@Override
	public void acept() {
		System.out.println("34");
		
	}

	@Override
	public void guess() {
		System.out.println("90");
		
	}

}
