package bronze.ascendingOrder;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			treeSet.add(b);
		}
		for (int i = 0; i < a; i++) {
			System.out.println(treeSet.pollFirst());
		}
		sc.close();
	}

}
