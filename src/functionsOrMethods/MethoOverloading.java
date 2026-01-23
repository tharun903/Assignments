package functionsOrMethods;

import java.util.Arrays;

public class MethoOverloading {

	public static void main(String[] args) {
		fun("Tharun");
		int ans = sum(2,3);
		System.out.println(ans);
		demo(2,3,4,5);
		demo("Tharun","Chandhu");

	}
	static void fun(int a) {
		System.out.println(a);
	}
	static void fun(String name) {
		System.out.println(name);
	}
	static int sum(int a,int b) {
		return a+b;
	}
	static void demo(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void demo(String ...v) {
		System.out.println(Arrays.toString(v));
	}

}
