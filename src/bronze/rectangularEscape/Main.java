package bronze.rectangularEscape;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = a - 0;
		int f = b - 0;
		int g = c - a;
		int h = d - b;
		if (e <= g && e <= f && e <= h) {
			System.out.println(e);
		} else if (g <= e && g <= f && g <= h) {
			System.out.println(g);
		} else if (f <= e && f <= g && f <= h) {
			System.out.println(f);
		} else {
			System.out.println(h);
		}
		sc.close();

	}

}
