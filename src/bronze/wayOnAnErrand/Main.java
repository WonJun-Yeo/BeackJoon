package bronze.wayOnAnErrand;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sec = a + b + c + d;
		System.out.println(sec/60);
		System.out.println(sec%60);
		sc.close();
	}

}
