package functions;
import java.util.*;
public class MinimumAndMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int first = sc.nextInt();
		System.out.print("Enter the second number : ");
		int sec = sc.nextInt();
		System.out.print("Enter the Third number : ");
		int third = sc.nextInt();
		int max = largest(first,sec,third);
		int min = smallest(first,sec,third);

		System.out.println("Largest is "+max);
		System.out.println("Smallest is "+min);

	}
	static int largest(int first,int sec,int third) {
		int max = first;
		if(sec>max) {
			max = sec;
		}
		if(third>max) {
			max = third;
		}
		return max;
	}
	static int smallest(int first,int sec,int third) {
		int min = first;
		if(sec<min) {
			min = sec;
		}
		if(third < min) {
			min = third;
		}
		return min;
	}


}
