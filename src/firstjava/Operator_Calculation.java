package firstjava;
import java.util.Scanner;
public class Operator_Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value : ");
		double a = sc.nextDouble();
		System.out.print("Enter the second value : ");
		double b = sc.nextDouble();
		System.out.print("Enter the operator (+,-,*/) : ");
		char c = sc.next().charAt(0);
		if(c=='+') {
			System.out.println(a+" + "+b+" = "+(a+b));
		}
		else if(c=='-') {
			System.out.println(a+" - "+b+" = "+(a-b));
		}
		else if(c=='*') {
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		else if(c=='/') {
			System.out.println(a+" / "+b+" = "+(a/b));
			
		}
		else {
			System.out.println("Please check the operator or a number you had given");
		}

	}

}
