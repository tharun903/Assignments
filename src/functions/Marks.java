package functions;
import java.util.*;
public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.next();
		System.out.print("Enter the Marks : ");
		int n = sc.nextInt();
		String Grade = Grade(n);
		System.out.println(name+" : "+Grade);

	}
	static String Grade(int n) {
		return (n>=91)?"AA"
				:(n>=81)?"AB"
				:(n>=71)?"BB"
				:(n>=61)?"BC"
				:(n>=51)?"CC"
				:(n>=41)?"CD"
				:(n>=35)?"DD"
						:"Fail";
	}

}
