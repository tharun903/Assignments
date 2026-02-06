package firstjava;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String rev = "";
		for(int i=n.length()-1;i>=0;i--) {
			rev += n.charAt(i);
		}
		if(rev.equalsIgnoreCase(n)) {
			System.out.println(n + " is a palindrome ");
		}else {
			System.out.println(n + " is not a palindrome ");
		}
	}

}
