package silver.zero;

import java.util.ArrayList;
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
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list.remove(i);
				list.remove(i-1);
				i = i - 2;
			}
		}
		
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
