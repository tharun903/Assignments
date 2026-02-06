package conditionalsloops;
import java.util.Scanner;
public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the calue of X1 : ");
		int x1 = sc.nextInt();
		System.out.print("Enter the calue of X2 : ");
		int x2 = sc.nextInt();
		System.out.print("Enter the calue of Y1 : ");
		int y1 = sc.nextInt();
		System.out.print("Enter the calue of Y2 : ");
		int y2 = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		distance = Math.round(distance*100.0)/100.0;
		System.out.println(distance);

	}

}
