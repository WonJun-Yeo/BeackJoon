package bronze.halfAndGalfChicken;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = 0;
		
		if (a + b > c * 2) {
			if (x > y) {
				int d = x - y;
				
				if ((a * d) + (c * y * 2) < x * c * 2) {
					z = (a * d) + (c * y * 2);
				} else {
					z = x * c * 2;
				}
			} else {
				int d = y - x;
				if ((b * d) + (c * x * 2) < y * c * 2) {
					z = (a * d) + (c * y * 2);
				} else {
					z = y * c * 2;
				}
			}
			System.out.println(z);
		} else {
			if (x > y) {
				if (x * c * 2 > (x * a) + (y * b)) {
					z = (x * a) + (y * b);
				} else {
					z = x * c * 2;
				}
			} else {
				if (y * c * 2 > (x * a) + (y * b)) {
					z = (x * a) + (y * b);
				} else {
					z = y * c * 2;
				}
			}
			System.out.println(z);
		}
		sc.close();
	}

}
