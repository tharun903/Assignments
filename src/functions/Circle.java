package functions;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of the circle : ");
		double radius = sc.nextDouble();
		double Area = AreaOfCircle(radius);
		double circumference = circumference(radius);
		System.out.println("Area of circle is "+Area);
		System.out.println("Circumference of circle is "+circumference);
	}
	static double AreaOfCircle(double radius) {
		double Area = Math.PI*Math.pow(radius, 2);
		return Math.round(Area*100.0)/100.0;
	}
	static double circumference(double radius) {
		double circumference = 2*(Math.PI)*radius;
		return Math.round(circumference*100.0)/100.0;
	}

}
