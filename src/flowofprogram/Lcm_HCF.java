package flowofprogram;
import java.util.*;
public class Lcm_HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		int min = Math.min(a, b);
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				temp = i;
			}
			
		}
		System.out.println("HCF : "+temp);
		int lcm = a*b/temp;
		System.out.println("LCM : "+lcm);
		

	}

}
