package functions;
import java.util.*;
public class Arthmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first input : ");
		int m = sc.nextInt();
		System.out.print("Enter the second input : ");
		int n = sc.nextInt();
		int sum = sum(m,n);
		double prod = prod(m,n);
		System.out.println("Sum of given numbers is :"+sum);
		System.out.println("Product of given input is :"+prod);
		
	}
	static int sum(int m, int n) {
		return m+n;
	}
	static double prod(int m,int n) {
		return m*n;
	}

}
