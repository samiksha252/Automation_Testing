package encapsulation;

public class Encapsulation1 {

	String password="STP12";
		private void login(String d) {
			password= d;
			System.out.println(d);
		}
		
		float g =23.78f;
		private void  name(float x) {
			g=x;
			System.out.println(x);
		}
	

	public static void main(String[] args) {
		Encapsulation1 app= new Encapsulation1();
		app.login("PQRS");
		
		
	    app.name(34.67f);
		

	}

}
