package silver.symmetricDifferentialSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> list = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		for (int i = 0; i < c; i++) {
			int d = sc.nextInt();
			list.add(d);
		}
		System.out.println(list.size() - (c - list.size()));
		
		sc.close();

	}

}
