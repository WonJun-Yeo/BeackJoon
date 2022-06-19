package silver.sortInSide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		String str = sc.next();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (Character k : list) {
			System.out.print((char)k);
		}
		
		sc.close();
	}

}
