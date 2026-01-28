package linearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int target = 5;
		int start = 1;
		int end = 4;
		int ans = Inrange(arr, target, start, end);
		System.out.println(ans);

	}
	static int Inrange(int[] arr,int target,int start,int end) {
		for(int i=start;i<=end;i++) {
			if(target==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
