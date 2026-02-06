package functionsOrMethods;

public class Scope {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println(a);
		System.out.println(b);
		
		if(a<b) {
			int c = 3;
			System.out.println(c);
		}

	}
	static void method() {
		//System.out.println(a);
	}

}
