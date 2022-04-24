package bronze.Max;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 1;
		int index = 0;
		int array[] = new int[9];
		for (int i = 0; i < 9; i++) {
			int b = sc.nextInt();
			array[i] = b;
		}
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index + 1);
		sc.close();
	}
}
