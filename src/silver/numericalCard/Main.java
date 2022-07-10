package silver.numericalCard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr1 = new int[a];
		
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			arr1[i] = c;
		}
		
		int b = sc.nextInt(); 
		int[] arr2 = new int[b];
		
		for (int i = 0; i < b; i++) {
			int c = sc.nextInt();
			for (int j = 0; j < a; j++) {
				if(arr1[j] == c) {
					arr2[i] = 1;
					break;
				}
				arr2[i] = 0;
			}
		}
		
		for (int i = 0; i < b; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		
		sc.close();
	}
}
