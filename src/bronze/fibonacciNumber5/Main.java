package bronze.fibonacciNumber5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] array = new int[a+1];
		for (int i = 0; i <= a; i++) {
			if (i == 0) {
				array[i] = 0;
			} else if (i == 1) {
				array[i] = 1;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
		}
		System.out.println(array[a]);
		sc.close();
	}
}
