package silver.primeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int num = m; num <= n; num++) {
			int b = 0;
			for(int i=2; i * i <= num; i++) {
				if(num % i == 0) {
					b = -1;
					continue;
				}
			}
			if (b == 0) {
				list.add(num);
			}
		}
		
		
		for (int k : list) {
			System.out.println(k);
		}
		sc.close();
	}

}
