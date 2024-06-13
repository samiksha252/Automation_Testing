package overriding;

public class Child_class extends Parent_Class {
	
	public void book() {
		System.out.println(" The method of child class");
	}

	public static void main(String[] args) {
	// child class object
		Child_class y= new Child_class();
		y.book();
		
		// 3rd properties of inheritance
		Parent_Class b= new Child_class();
		b.book();
		
		// has a relationship
		Parent_Class o= new Parent_Class();
		o.book();

	}

}
