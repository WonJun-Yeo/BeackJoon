package bronze.atSign;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int j = 0; j < a; j++) {
			for (int i = 0; i <5 * a; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for (int j = 0; j < a * 4; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
