package functionsOrMethods;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		int ans = sum2(a,b);
		System.out.println("Sum of two input is : "+ans);
		
	}
	static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		int sum = a+b;
		return sum;
	}
	static int sum2(int a,int b) {
		int sum = a+b;
		return sum;
	}
		
}
	
