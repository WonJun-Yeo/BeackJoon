package bronze.fourthDot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int x = 0;
		int y = 0;
		if (a2 == a3) {
			x = a1;
		} else if (a1 == a3) {
			x = a2;
		} else {
			x = a3;
		}
		if (b2 == b3) {
			y = b1;
		} else if (b1 == b3) {
			y = b2;
		} else {
			y = b3;
		}
		System.out.println(x + " " + y);
		sc.close();
	}
}
