package silver.stonGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a % 3 == 1 ||a % 3 == 0) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
		
		
		
		sc.close();

	}

}
