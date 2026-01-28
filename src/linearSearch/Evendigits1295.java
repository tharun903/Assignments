package linearSearch;

public class Evendigits1295 {

	public static void main(String[] args) {
		int[] arr = {223,34,3455,8,9};
		int ans = digits2(7668);
		System.out.println(ans);

	}
	static int findnum(int[] arr) {
		int count = 0;
		for(int num : arr) {
			if(even(num)) {
				count ++;
			}
		}
		return count;
	}
	static boolean even(int num) {
		int digits = digits(num);
		return digits%2==0;
	}
	static int digits(int num) {
		int count = 0;
		if(num<0) {
			num*=-1;
		}
		if(num == 0) {
			return 1;
		}
		while(num>0) {
			count ++;
			num=num/10;
		}
		return count;
	}
	
	static int digits2(int num) {
		if(num<0) {
			num*=-1;
		}
		if(num == 0) {
			return 1;
		}
		return (int)(Math.log10(num)+1);
	}

}
