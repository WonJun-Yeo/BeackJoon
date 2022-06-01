package bronze.isItBig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		boolean a = true;
		while (a) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b == 0 && c == 0) {
				a = false;
			} else {
				if (b > c) {
					arr.add("Yes");
				} else {
					arr.add("No");
				}
			}
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		sc.close();
	}

}
