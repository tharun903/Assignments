package conditionalsloops;
import java.util.*;
public class Cone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double volume = (1.0/3)*Math.PI*Math.pow(radius, 2)*height;
		double rounded = Math.round(volume*100.0)/100.0;
		System.out.println("Volume of the cone is "+rounded);

	}

}
