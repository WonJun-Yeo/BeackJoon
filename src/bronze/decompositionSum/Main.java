package bronze.decompositionSum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1000000;
		for (int i = 1; i <= 1000000; i++) {
			if (((i%10) + ((i%100)/10) + ((i%1000)/100) + ((i%10000)/1000) + ((i%100000)/10000) + ((i%1000000)/100000) + i) == a) {
				if (b > i) {
					b = i;
					break;
				}
			}
		}
		
		if (b == 1000000) {
			System.out.println(0);
		} else {
			System.out.println(b);
		}
		
		
		sc.close();
	}
}
