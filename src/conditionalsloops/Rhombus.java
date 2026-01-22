package conditionalsloops;
import java.util.*;
public class Rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side : ");
		int side = sc.nextInt();
		System.out.print("Enter the diagonal 1 : ");
		int d1 = sc.nextInt();
		System.out.print("Enter the diagonal 2 : ");
		int d2 = sc.nextInt();
		double Area = 0.5*(d1+d2);
		double round = Math.round(Area*100.0)/100.0;
		double perimeter = 4*side;
		System.out.println("Area : "+round);
		System.out.println("Perimeter : "+perimeter);
		
	}

}
