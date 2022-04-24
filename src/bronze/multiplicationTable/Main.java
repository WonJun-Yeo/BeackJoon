package bronze.multiplicationTable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			if (i == a) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
		sc.close();
	}
}
