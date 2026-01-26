package arrays_LeetcodeQuestions;
import java.util.*;
public class Permutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {0,2,1,5,3,4};
		solution_1920(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	static void solution_1920(int[] arr) {
		int[] newarr = arr.clone();
		for(int i=0;i<arr.length;i++) {
			arr[i] = newarr[newarr[i]];
			
		}
		
	}

}
