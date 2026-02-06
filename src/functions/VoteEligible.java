package functions;
import java.util.*;
public class VoteEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		boolean isEligible = voteEligible(age);
		if(isEligible) {
			System.out.println(name+" is able to vote");
		}else {
			System.out.println(name+" is under 18");
		}

	}
	static boolean voteEligible(int age) {
		
		if(age<18) {
			return false;
		}else {
			return true;
		}
	}

}
