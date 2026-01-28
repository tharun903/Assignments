package linearSearch;

import java.util.Arrays;

public class StringProblem {

	public static void main(String[] args) {
		String name = "Tharunkumar";
		char letter = 'u';
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(search(name, letter));
		System.out.println(search2(name, letter));
	}
	static boolean search(String name,char letter) {
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(letter == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean search2(String name,char letter) {
		if(name.length()==0) {
			return false;
		}
		for(char ch : name.toCharArray()) {
			if(ch==letter) {
				return true;
			}
		}
		return false;
	}

}
