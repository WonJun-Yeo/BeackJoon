package bronze.safariWorld;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		if (a -b >= 0) {
			System.out.println(a - b);
		} else {
			System.out.println(b - a);
		}
		sc.close();
	}

}
