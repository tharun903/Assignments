package firstjava;
import java.util.*;
public class NumberOfArmstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int m = sc.nextInt();
		System.out.print("Enter the Ending number : ");
		int n = sc.nextInt();
		for(int i=m;i<=n;i++) {
			int orginal = i;
			int digits = String.valueOf(i).length();
			int temp = i;
			int sum = 0;
			while (temp>0) {
				int rem = temp%10;
				sum+=Math.pow(rem, digits);
				temp/=10;
			}
			if(sum == orginal) {
				System.out.print("The Armstrong numbers are : "+orginal+" ");
			}
		}

	}

}
