package bronze.helmetAndVest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long maxa = 0;
		long maxb = 0;
		
		for (int i = 0; i < a; i++) {
			long c = sc.nextLong();
			if (c > maxa) {
				maxa = c;
			}
		}
		for (int i = 0; i < b; i++) {
			long c = sc.nextLong();
			if (c > maxb) {
				maxb = c;
			}
		}
		System.out.println(maxa + maxb);
		sc.close();

	}

}
