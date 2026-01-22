package conditionalsloops;
import java.util.*;
public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double volume = Math.PI*Math.pow(radius, 2)*height;
		double rounded = Math.round(volume*100.0)/100.0;
		double Curve = 2*(Math.PI)*radius*height;
		double rounded1 = Math.round(Curve*100.0)/100.0;
		System.out.println("Volume : "+rounded);
		System.out.println("Curved Surface Area : "+rounded1);

	}

}
