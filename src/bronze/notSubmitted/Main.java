package bronze.notSubmitted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] arr2 = new int[28];
		List<Integer> arr3 = new ArrayList<>();
		for (int i = 0; i <28; i++) {
			int a = sc.nextInt();
			arr2[i] = a;
		}
		
POS:	for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 28; j ++) {
				if (arr1[i] == arr2[j]) {
					continue POS;
				}
			}
			arr3.add(arr1[i]);
		}
		
		for (int k : arr3) {
			System.out.println(k);
		}
		
		sc.close();
	}

}
