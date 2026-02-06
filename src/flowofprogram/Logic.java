package flowofprogram;
import java.util.*;
public class Logic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			String input = sc.next();
			if(input.equalsIgnoreCase("x")) {
				break;
			}
			int num = Integer.parseInt(input);
			sum+=num;
		}
		System.out.println(sum);
		
		
	}

}
