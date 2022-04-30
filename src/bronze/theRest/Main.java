package bronze.theRest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> arr = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr.add(a % 42);
		}
		
		System.out.println(arr.size());
		sc.close();
	}
}
