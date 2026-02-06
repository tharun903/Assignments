package functionsOrMethods;
import java.util.*;
public class Greeting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.next();
		String result = name+" "+greet();
		System.out.println(result);
		
	}
	static String greet() {
		String greeting = "How are you";
		return greeting;
		
	}
	

}
