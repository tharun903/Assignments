package array_ArrayList;
import java.util.*;
public class PassingInFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		for(int i=0;i<4;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		change(num);
		System.out.println(Arrays.toString(num));
		

	}
	static void change(int[] arr) {
		arr[2] = 97;
	}
	
	

}
