package silver.treasure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List <Integer> listA = new ArrayList<>();
		List <Integer> listB = new ArrayList<>();
		int sum = 0;
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			listA.add(b);
		}
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			listB.add(b);
		}
		Collections.sort(listA);
		Collections.sort(listB, Collections.reverseOrder());
		
		for (int i = 0; i < a; i++) {
			sum += listA.get(i) * listB.get(i);
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
