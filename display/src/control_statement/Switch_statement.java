	package control_statement;

	public class Switch_statement {

		public static void main(String[] args) {
			
			int day=5;
			String days="None";
			
			switch (day) {
			case 1:
				days="Monday";
				break;
			case 2:
				days="Tuesday";
				break;
			case 3:
				days="Wednesday";
				break;
			case 4:
				days="Thusday";
				break;
			case 5:
				days="Friday";
				break;
			case 6:
				days="Saturday";
				break;
			case 7:
				days="Sunday";
				break;
				
			default:
				System.out.println("Above days are not present");
				break;
		
			}System.out.println("Fifth day is:"+days);
			
		  }
	    }
	
		
	
		
	





