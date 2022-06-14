package silver.intervalSum04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		int[] arr2 = new int[b];
		
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		
		for (int i = 0; i < b; i++) {
			int d = sc.nextInt();
			int e = sc.nextInt();
			if (d == e) {
				arr2[i] = arr[d-1];
			} else {
				int sum = 0;
				for (int j = d; j <= e; j++) {
					sum += arr[j-1];
				}
				arr2[i] = sum;
			}
		}
		
		for (int k : arr2) {
			System.out.println(k);
		}
		
		sc.close();

	}

}
