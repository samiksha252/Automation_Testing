package abstract_package;

public class Normal_Class2 extends Abstract_Class3 {

	public static void main(String[] args) {
		Normal_Class2 i = new Normal_Class2();
		i.username();
		i.delete();

	}

	@Override
	public void username() {
        System.out.println("Enter username");
		
	}

	@Override
	public void delete() {
		System.out.println("delete username");
		
	}

}
