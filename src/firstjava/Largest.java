package firstjava;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value : ");
		int a = sc.nextInt();
		System.out.print("Enter the second value : ");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("Largest Number is "+a);
		}else {
			System.out.println("Largest Number is "+b);
		}
	}

}
