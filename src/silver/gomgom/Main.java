package silver.gomgom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> list = new HashSet<>();
		List<Integer> list2 = new ArrayList<>();
		int sum = 0;
		
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String str = sc.next();
			if (str.equals("ENTER")) {
				list2.add(list.size());
				list.removeAll(list);
			} else {
				list.add(str);
			}
		}
		list2.add(list.size());
		
		for (int k : list2) {
			sum += k;
		}
		System.out.println(sum);
		
		
		sc.close();
		
		

	}

}
