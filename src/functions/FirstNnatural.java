package functions;
import java.util.*;
public class FirstNnatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumOfNatural(n);

	}
	static void sumOfNatural(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of first "+n+" numbers is "+sum);
	}

}
