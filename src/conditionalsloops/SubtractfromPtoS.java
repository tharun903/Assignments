package conditionalsloops;
import java.util.*;
public class SubtractfromPtoS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int prod = 1;
		while (n>0) {
			int digit = n%10;
			sum+=digit;
			prod*=digit;
			n/=10;
		}
		int subtraction = prod-sum;
		System.out.println(subtraction);
	}

}
