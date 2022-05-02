package bronze.repeatString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Character> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			String b = sc.next();
			char[] c = b.toCharArray();
			
			for (int k = 0; k < c.length; k++) {
				if (k < c.length -1) {
					for (int j = 0; j < a ;j++) {
						arr.add(c[k]);
					}
				} else {
					for (int j = 0; j < a ;j++) {
						arr.add(c[k]);
					}
					arr.add('\n');
				}
				
			}
		}
		for (int j = 0; j < arr.size(); j++) {
			System.out.print(arr.get(j));
		}
	}

}
