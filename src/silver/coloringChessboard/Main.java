package silver.coloringChessboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int record = sc.nextInt();
		int repair = 0;
		for (int i = 1; i <= row; i++) {
			String color = sc.next();
			char[] arr = color.toCharArray();
			for (int j = 1; j < record; j++) {
				if (i % 2 == 1 && j % 2 == 1) {
					if (arr[j-1] == 'B') {
						repair++;
					}
				} else if (i % 2 == 1 && j % 2 == 0) {
					if (arr[j-1] == 'W') {
						repair++;
					}
				} else if (i % 2 == 0 && j % 2 == 1) {
					if (arr[j-1] == 'W') {
						repair++;
					}
				} else if (i % 2 == 0 && j % 2 == 0) {
					if (arr[j-1] == 'B') {
						repair++;
					}
				}
			}
		}
		System.out.println(repair);
		sc.close();

	}

}
