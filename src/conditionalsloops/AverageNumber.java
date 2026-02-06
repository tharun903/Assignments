package conditionalsloops;
import java.util.*;
public class AverageNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of input : ");
		int n = sc.nextInt();
		int sum = 0;
		if(n<=0) {
			System.out.println("Invalid count");
		}
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the number "+i +" : ");
			double num = sc.nextDouble();
			sum+=num;
		}
		
		double avg = sum/n;
		System.out.println("Average : "+avg);

	}

}
