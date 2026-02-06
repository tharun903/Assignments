package firstjava;
import java.util.*;
public class Currency_USD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Indian Rupees : ");
		double Ruppes = sc.nextDouble();
		double USD = Ruppes/91.6;
		double rounded = Math.round(USD*100.0)/100.0;
		System.out.println("USD : "+rounded);

	}

}
