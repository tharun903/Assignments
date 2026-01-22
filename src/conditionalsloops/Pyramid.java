package conditionalsloops;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double volume = (1.0/3)*(Math.pow(b, 2))*h;
		System.out.println("Volume pf Pyramid is "+Math.round(volume*100.0)/100.0);

	}

}
