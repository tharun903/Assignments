package conditionalsloops;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double Area = 0.5*b*c;
		double rounded = Math.round(Area*100.0)/100.0;
		double Perimeter = a+b+c;
		System.out.println("Area of the Triangle = "+rounded);
		System.out.println("Perimeter of the Triangle = "+Perimeter);

	}

}
