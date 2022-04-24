package bronze.average;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] array = new double[a];
		double max = 0;
		double sum = 0;
		for (int i = 0; i < a; i++) {
			double b = sc.nextInt();
			array[i] = b;
		}
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = (array[i]/max)*100;
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println((double)(sum/array.length));
		sc.close();
	}
}
