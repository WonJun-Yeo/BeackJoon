package silver.sortCounts02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			list.add(b);
		}
		Collections.sort(list);
		
		for (Integer k : list) {
			System.out.println(k);
		}
		
		sc.close();
	}

}
