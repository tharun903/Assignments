package functions;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean palindrom = palindromenum(n);
		if(palindrom) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("Its not a palindrome");
		}
		
	}
	static boolean palindromenum(int n) {
		int orginal = n;
		int reverse  = 0;
		while(n>0) {
			int rem = n%10;
			reverse = reverse*10+rem;
			n/=10;
			
		}
		return (reverse==orginal);
	}
}
