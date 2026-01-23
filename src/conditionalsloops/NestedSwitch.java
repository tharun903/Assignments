package conditionalsloops;
import java.util.*;
public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		String dept = sc.next();
		
		switch(empId) {
		case 20011 -> System.out.println("Name : Tharun");
		case 20022 -> System.out.println("Name : Sai");
		case 20023 -> {
	        System.out.println("Name : Somu");

	        switch (dept) {
	            case "IT" -> System.out.println("Department : IT");
	            case "Managementdept" -> 
	                System.out.println("Department : Management dept");
	            default -> 
	                System.out.println("Please re-check the department");
	        }
	    }

	    default -> System.out.println("Invalid number");
	}
	}

}
