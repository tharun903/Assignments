package conditionalsloops;
import java.util.*;
public class Sphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double volume = (4/3)*Math.PI*Math.pow(radius, 3);
		System.out.println("Volume of the sphere : "+Math.round(volume*100.0)/100.0);

	}

}
