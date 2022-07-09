package silver.groupWordChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int minus = 0;
		
		for (int i = 0; i < a; i++) {
			char[] arr = sc.next().toCharArray();
			
POS:		for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] != arr[j+1]) {
					for (int k = j + 1; k < arr.length; k++) {
						if (arr[k] == arr[j]) {
							minus++;
							break POS;
						}
					}
				}
			}
		}
		System.out.println(a - minus);
		sc.close();
	}

}
