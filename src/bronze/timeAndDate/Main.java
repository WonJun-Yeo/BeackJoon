package bronze.timeAndDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (b >=0 && b<=23) {
				if(c >=0 && c<=59) {
					arr.add("Yes ");
				} else {
					arr.add("No ");
				}
			} else {
				arr.add("No ");
			}
			
			if (b >=1 && b <=12) {
				if(b == 1 || b == 3 || b == 5 || b ==7 ||b == 8 || b == 10 || b == 12) {
					if (c >=1 && c<= 31) {
						arr.add("Yes");
					} else {
						arr.add("No");
					}
				} else if (b == 2) {
					if (c >=1 && c<= 29) {
						arr.add("Yes");
					} else {
						arr.add("No");
					}
				} else {
					if (c >=1 && c<= 30) {
						arr.add("Yes");
					} else {
						arr.add("No");
					}
				}
			} else {
				arr.add("No");
			}
		}
		
		for (int i = 0; i < arr.size(); i++) {
			if (i == 0) {
				System.out.print(arr.get(i));
			} else if (i % 2 == 0) {
				System.out.print(arr.get(i));
			} else {
				System.out.println(arr.get(i));
			}
		}

	}

}
