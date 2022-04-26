package bronze.decompositionSum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1000000;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (a == (i * 100) + (j * 10) + k + i + j + k) {
						if (b > (i * 100) + (j * 10) + k) {
							b = (i * 100) + (j * 10) + k;
						}
					}
				}
			}
		}
		if (b == 1000000) {
			System.out.println(0);
		} else {
			System.out.println(b);
		}
		sc.close();
	}
}
