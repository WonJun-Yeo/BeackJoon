package bronze.binaryCoefficient;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		int d = 1;
		
		// b�� 0�̸� 1���
		if (b != 0 && a != b) {
			for (int i = 0; i < b;i++) {
				c *= (a-i);
			}
			for (int i = 0; i < b; i++) {
				d *= (b-i);
			}
		}
		
		System.out.println(c/d);
		sc.close();
	}

}
