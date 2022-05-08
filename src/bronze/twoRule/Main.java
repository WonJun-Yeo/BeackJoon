package bronze.twoRule;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b > c) {
			System.out.println((int)((a * b) / c));
		} else {
			System.out.println((int)((a * c) / b));
		}
		
		
		
		sc.close();
	}

}
