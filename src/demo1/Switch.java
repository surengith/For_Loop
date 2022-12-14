package demo1;

public class Switch {


	public static void main(String[] args) {
		
		String Office_Location = "Location 3";
		
		switch(Office_Location) {
		
		case "Location" : System.out.println("Anna Salai");
		
		break;

		case "Location 1": System.out.println("IT Park");
		
		break;
		
		case "Location 2": System.out.println("Bangalore");
		
		break;
		
        case "Location 3": System.out.println("Coimbatore");
		
		break;
		
		default:
		
			System.out.println("Enter the valid location");
			
		}

	}

}