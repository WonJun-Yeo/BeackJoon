package bronze.lessThanX;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		for (int i = 0; i < a; i++) {
			int d = sc.nextInt();
			if (b > d) {
				if(c == 0) {
					System.out.print(d);
					c++;
				} else {
					System.out.print(" " + d);
				}
			}
		}
		sc.close();
	}
}
