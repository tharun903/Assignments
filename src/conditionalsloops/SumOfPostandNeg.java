package conditionalsloops;
import java.util.Scanner;
public class SumOfPostandNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int negSum = 0;
		int postEvenSum = 0;
		int postOddSum = 0;
		while(true) {
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input<0) {
				negSum+=input;
			}else if(input%2==0) {
				postEvenSum+=input;
			}else {
				postOddSum+=input;
			}
		}
		System.out.println("NegSum : "+negSum);
		System.out.println("Postive Even Sum :"+postEvenSum);
		System.out.println("Postive Odd Sum : "+postOddSum);
		
	}

}
