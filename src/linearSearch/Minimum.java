package linearSearch;

public class Minimum {

	public static void main(String[] args) {
		int[] arr = {18,7,90,78,45,3,93,2};
		int ans = minimumLinear(arr);
		int ans1 = maximumLinear(arr);
		System.out.println(ans);
		System.out.println(ans1);

	}
	static int minimumLinear(int[] arr) {
		int minimum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(minimum>arr[i]) {
				minimum = arr[i];
			}
		}
		return minimum;
	}
	
	static int maximumLinear(int[] arr) {
		int maximum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(maximum<arr[i]) {
				maximum = arr[i];
			}
		}
		return maximum;
	}

}
