package bronze.numberOfnumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int multi = a * b * c;
		int[] iarr = {0,0,0,0,0,0,0,0,0,0};
		
		
		String str = Integer.toString(multi);
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i ++) {
			for (int j = 0; j < 10; j++) {
					if (Character.getNumericValue(array[i]) == j) {
						iarr[j] += 1;
					}
				}
			}
		for (int k : iarr) {
			System.out.println(k);
		}
		sc.close();
		}
}
