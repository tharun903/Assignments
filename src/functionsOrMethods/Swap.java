package functionsOrMethods;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		function(a,b);
		

	}
	static void function(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap \n   first number = "+a +"\n   second number = "+b);
		
		
	}

}
