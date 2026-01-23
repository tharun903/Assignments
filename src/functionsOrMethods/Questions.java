package functionsOrMethods;
import java.util.*;
public class Questions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = isprime(n);
		System.out.println(ans);
		boolean ori = armstrong(n);
		System.out.println(ori);
		
		for(int i=100;i<=1000;i++) {
			if(armstrong(i)) {
				System.out.print(i+" ");
			}
		}
	}
	static boolean isprime(int n) {
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
		return (c*c>n);
		
	}
	
	static boolean armstrong(int n) {
		int sum = 0;
		int original = n;
		while (n>0) {
			int rem = n%10;
			int cube = rem*rem*rem;
			sum +=cube;
			n/=10;
			
		}
		return (sum==original);
	}
	

}
