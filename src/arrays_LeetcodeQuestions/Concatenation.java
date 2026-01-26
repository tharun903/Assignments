package arrays_LeetcodeQuestions;
import java.util.*;
public class Concatenation {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] ans = solution_1929(arr);
		
		System.out.println(Arrays.toString(ans));

	}
	static int[] solution_1929(int[] arr) {
		int[] result = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			result[i] = arr[i];
			result[i+arr.length] = arr[i];
		}
		return result;
		
	}

}
