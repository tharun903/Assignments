package functions;
import java.util.*;
public class Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		int n = sc.nextInt();
		int factorial = factorial(n);
		System.out.println("Factorial of "+n+" is : "+factorial);

	}
	static int factorial(int n) {
		int fact = 1;
		 if (n == 0 || n == 1) {
		        return 1;
		    }
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}

}
