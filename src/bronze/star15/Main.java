package bronze.star15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int j = 1; j <= a; j++) {
			if (j == 1) {
				System.out.println("*");
			} else {
				System.out.print("*");
				int b = 2 * a -3;
				for (int i = 0; i < b; i++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		sc.close();
	}

}
