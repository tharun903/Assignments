package firstjava;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double P = sc.nextInt();
		double R = sc.nextFloat();
		int T = sc.nextInt();
		double SimpleInterest = (P*R*T)/100;
		System.out.println("SimpleInterest is : "+SimpleInterest);
		System.out.println("Total Amount is : "+ (P+SimpleInterest));
		
	}

}
