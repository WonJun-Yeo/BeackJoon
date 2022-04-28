package bronze.drainageAndMineralWater;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b % a == 0) {
			System.out.println("factor");
		} else if (a % b == 0) {
			System.out.println("multifle");
		} else if (a == 0 || b==0) {
		}
		else {
			System.out.println("neither");
		}
		sc.nextInt();
	}

}
