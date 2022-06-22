package silver.snakeBird;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			list.add(c);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i< list.size(); i++) {
			if (b >= list.get(i)) {
				b++;
			} else {
				break;
			}
		}
		
		System.out.println(b);
		
		sc.close();

	}

}
