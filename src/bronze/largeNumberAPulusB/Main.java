package bronze.largeNumberAPulusB;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long sum = a + b;
		System.out.println(sum);
		sc.close();
	}
}
