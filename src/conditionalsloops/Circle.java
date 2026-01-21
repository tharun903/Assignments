package conditionalsloops;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		double Area = Math.PI*Math.pow(radius, 2);
		double rounded = Math.round(Area*100.0)/100.0;
		System.out.println("Area of circle is "+rounded);
		
		double Perimeter = 2*Math.PI*radius;
		double rounded1 = Math.round(Perimeter*100.0)/100.0;
		System.out.println("Perimeter of circle is "+rounded1);

	}

}
