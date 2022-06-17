package silver.card02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			list.add(i);
		}
		for (int i = 0; ; i++) {
			list.remove(0);
			list.add(list.get(0));
			list.remove(0);
			if (list.size() == 1) {
				break;
			}
		}
		System.out.println(list.get(0));
		
		sc.close();

	}

}
