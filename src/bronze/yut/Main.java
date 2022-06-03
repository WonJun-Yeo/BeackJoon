package bronze.yut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<>();
		for (int j = 0; j < 3; j++) {
			String a = sc.nextLine();
			char[] arr = a.toCharArray();
			int b = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '0') {
					b++;
				}
			}
			
			if (b == 0) {
				li.add("E");
			} else if (b == 1) {
				li.add("A");
			} else if (b == 2) {
				li.add("B");
			} else if (b == 3) {
				li.add("C");
			} else {
				li.add("D");
			}
		}
		
		for (String k : li) {
			System.out.println(k);
		}
		
		sc.close();
	}

}
