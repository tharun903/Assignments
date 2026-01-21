package firstjava;
import java.util.*;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digits = String.valueOf(n).length();
		int original = n;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum+=Math.pow(rem, digits);
			n/=10;
		}
		if(original==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
