package conditionalsloops;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of the Rectangle : ");
		int length = sc.nextInt();
		System.out.print("Enter the bredth of the Rectangle : ");
		int bredth = sc.nextInt();
		double Area = length*bredth;
		double Perimeter = 2*(length+bredth);
		System.out.println("Area : "+Area);
		System.out.println("Perimeter : "+ Perimeter);
		

	}

}
