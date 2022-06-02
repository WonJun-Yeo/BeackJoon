package bronze.multiplication04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		List<Integer> sumArr = new ArrayList<>();
		int z = 0;
		
		while (loop > z) {
			String b = sc.nextLine();
			System.out.println(b);
			int sum = 0;
			String[] arr = b.split("\\s");
			System.out.println(arr.length);
			for (int j = 0; j < arr.length; j++) {
				sum = sum + Integer.parseInt(arr[j]);
			}
			sumArr.add(sum);
			loop--;
		}
			
		for (int k : sumArr) {
			System.out.println(k);
		}
		
		sc.close();
	}

}
