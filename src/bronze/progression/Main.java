package bronze.progression;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		for (int i = 1;;i++) {
			if (b == 1) {
				System.out.println(1);
				break;
			}
			if (b % 2 == 0) {
				b = b / 2;
			} else {
				b = 3 * b + 1;
			}
			if (b == 1) {
				System.out.println(i + 1);
				break;
			}
		}
		
		sc.close();
	}

}
