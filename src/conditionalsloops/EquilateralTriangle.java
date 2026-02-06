package conditionalsloops;
import java.util.*;
public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int Perimeter = 3*side;
		double Area = (Math.sqrt(3)/4)*side;
		double round = Math.round(Area*100.0)/100.0;
		System.out.println("Area : "+ round);
		System.out.println("Perimeter : "+ Perimeter);

	}

}
