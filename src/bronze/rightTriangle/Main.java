package bronze.rightTriangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> array = new ArrayList<>();
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a > b && a > c) {
				if (a*a == b*b + c*c) {
					array.add("right");
				} else {
					array.add("wrong");
				}
			} else if (b > a && b > c) {
				if (b*b == a*a + c*c) {
					array.add("right");
				} else {
					array.add("wrong");
				}
			} else if (c > a && c > b) {
				if (c*c == a*a + b*b) {
					array.add("right");
				} else {
					array.add("wrong");
				}
			} else if (a == 0 && b == a && c == a) {
				break;
			}
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		sc.close();
	}
}
