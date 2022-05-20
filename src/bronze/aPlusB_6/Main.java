package bronze.aPlusB_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			String[] arr = b.split(",");
			int c = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);		
			list.add(c);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}

}
