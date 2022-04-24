package bronze.OXQuiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] sumArray = new int[num];
		for (int i = 0; i < num; i++) {
			String a = sc.next();
			char[] array = a.toCharArray();
			int score = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == 'O') {
					score += 1;
					sumArray[i] += score;
				} else {
					score = 0;
				}
			}
		}
		for (int k : sumArray) {
			System.out.println(k);
		}
		sc.close();

	}
}
