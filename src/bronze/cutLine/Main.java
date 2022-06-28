package bronze.cutLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cut = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int score = sc.nextInt();
			list.add(score);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(cut - 1));
		
		sc.close();

	}

}
