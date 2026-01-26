package array_ArrayList;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int rows = sc.nextInt();
		System.out.print("Enter the number of colums :");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for(int row=0 ; row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				arr[row][column] = sc.nextInt();
				
			}
			
			
		}
		
//		for(int row=0 ; row<arr.length;row++) {
////			for(int column=0;column<arr[row].length;column++) {
////				System.out.print(arr[row][column]+" "); 
////			}
////			System.out.println();
//			System.out.println(Arrays.toString(arr[row]));
//			
//		}
		System.out.println("The matrix of the input array is : ");	
		for(int a[]:arr) {
			System.out.println(Arrays.toString(a));
		}

	}

}
