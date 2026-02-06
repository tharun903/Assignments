package conditionalsloops;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		while(true) {
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input > largest) {
				largest = input;
			}
			
		}
		System.out.println(largest);

	}

}
