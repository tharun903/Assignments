package linearSearch;

public class Firstproblem {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 4;
		int ans = linearsearch(arr,target);
		System.out.println(ans);
	}
	static int linearsearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return target;
			}
		}
		
		if(arr.length==0) {
			return -1;
		}
		return -1;
	}
	
	

}
