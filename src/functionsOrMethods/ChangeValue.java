package functionsOrMethods;
import java.util.*;
public class ChangeValue {

	public static void main(String[] args) {
		int [] arr = {0,2,3,87,9};
		change(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void change(int[] num) {
		num[1] = 23;
	}

}
