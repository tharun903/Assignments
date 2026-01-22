package conditionalsloops;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		double Area = Math.pow(side, 2);
		double Perimeter = 4*side;;
		System.out.println("Area : "+Area);
		System.out.println("Perimeter : "+Perimeter);

	}

}
