package conditionalsloops;
import java.util.*;
public class Parallelogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the Triangle : ");
		int base = sc.nextInt();
		System.out.print("Enter the height of the Triangle : ");
		int height = sc.nextInt();
		System.out.print("Enter the side of the Triangle : ");
		int side = sc.nextInt();
		double Area = base*height;
		double perimeter = 2*(side+base);
		System.out.println("Area : "+Area);
		System.out.println("Perimeter : "+perimeter);

	}

}
