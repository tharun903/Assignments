package functions;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = prime(n);
		if(prime) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}
	static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		int c = 2;
		if(c*c <= n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return(c*c>n);
	}

}
