package functionsOrMethods;

import java.util.Arrays;

public class Vargs {

	public static void main(String[] args) {
		fun(2,3,4,5,6,88,98);

	}
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}

}
