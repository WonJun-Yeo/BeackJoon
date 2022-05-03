package bronze.multipleAnddivisor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b==0) {
				break;
			} else if (a % b == 0) {
				arr.add("multiple");
			} else if (b % a == 0) {
				arr.add("factor");
			}
			else {
				arr.add("neither");
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		sc.close();
	}

}
