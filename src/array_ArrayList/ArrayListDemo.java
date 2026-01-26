package array_ArrayList;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>list = new ArrayList<>();
//		list.add(100);
//		list.add(93);
//		list.add(72);
//		list.add(87);
//		System.out.println(list.contains(72));
//		System.out.println(list);
//		System.out.println(list.lastIndexOf(list));
//		list.set(0, 1);
		System.out.println(list);
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list);
	}

}
