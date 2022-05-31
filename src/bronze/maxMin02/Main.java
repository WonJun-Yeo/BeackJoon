package bronze.maxMin02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> max = new ArrayList<>();
		List<Integer> min = new ArrayList<>();
		int x = -1000000;
		int n = 1000000;
		
		
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				int c = sc.nextInt();
				if (c < n) {
					n = c;
				}
				if (x < c) {
					x = c;
				}
			}
			max.add(x);
			min.add(n);
		}
		for (int i = 0; i < max.size(); i++) {
			System.out.print(min.get(i) + " ");
			System.out.println(max.get(i));
		}
		sc.close();

	}

}
