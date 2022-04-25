package bronze.sangSoo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int a1 = a/100;
		int a2 = (a % 100) / 10;
		int a3 = a % 10;
		
		int a4 = (a3 * 100) + (a2 * 10) + a1;

		int b1 = b/100;
		int b2 = (b % 100) / 10;
		int b3 = b % 10;
		
		int b4 = (b3 * 100) + (b2 * 10) + b1;
		
		if (a4 > b4) {
			System.out.println(a4);
		} else {
			System.out.println(b4);
		}
		
		sc.close();
	}
}
