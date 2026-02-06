package array_ArrayList;
import java.util.*;
public class Maximum {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,8};
		System.out.println(max(arr,1,4));
		System.out.println(min(arr,1,4));
	}
	static int max(int arr[],int start,int end) {
		if((end<start)||(arr == null)||(start<0)||(end>=arr.length)) {
			return -1;
		}
		
		
		
		int max = Integer.MIN_VALUE;
		for(int i=start;i<=end;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int min(int arr[],int start,int end) {
		if((end<start)||(arr == null)||(start<0)||(end>=arr.length)) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		for(int i=start;i<=end;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	

}
