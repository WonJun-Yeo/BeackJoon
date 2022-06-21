package silver.suffixArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = str.length();
		
		for (int i = 0; i < a; i++) {
			String b = str.substring(i, a);
			list.add(b);
		}
		
		Collections.sort(list);
		
		for (String l : list) {
			System.out.println(l);
		}
		
		
		sc.close();

	}

}
