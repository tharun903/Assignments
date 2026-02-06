package linearSearch;

import java.util.Arrays;



public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{18,9,6,3,4},
				{6,12,5,7},
				{98,34,6,4}
		};
		int target = 34;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		int ans1 = max(arr);
		System.out.println(ans1);
		int ans2  = min(arr);
		System.out.println(ans2);

	}
	static int[] search(int[][] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}
	
	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	static int min(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

}
