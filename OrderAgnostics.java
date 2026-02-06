package binary_search;

public class OrderAgnostics {

	public static void main(String[] args) {
		int[] arr= {1,8,9,14,18,20,22};
		int target = 9;
		int ans = OrderAgnosticsBS(arr, target);
		System.out.println(ans);

	}
	static int OrderAgnosticsBS(int[] arr,int target) {

		int start = 0;
		int end = arr.length-1;
		boolean isASC = arr[start]<arr[end];
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(isASC) {
				if(target<arr[mid]) {
					end = mid -1;
					
				}else if(target>arr[mid]) {
					start = mid+1;
					
				}
			}else {
				if(target>arr[mid]) {
					end = mid -1;
					
				}else if(target<arr[mid]) {
					start = mid+1;
					
				}
			}
			
			
		}
		return -1;
	
	}

}
