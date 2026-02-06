package functions;
import java.util.*;
public class Primebetween2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		prime(m, n);
	}
	static void prime(int m,int n) {
		for(int i=m;i<=n;i++) {
			if(i<2) {
				continue;
			}
			boolean isprime = true;
			for(int j=2;j*j<=i;j++) {
				if(j%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.print(i+" ");
			}
		}
		
	}

}
