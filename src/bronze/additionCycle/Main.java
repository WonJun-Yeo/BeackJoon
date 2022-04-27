package bronze.additionCycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int ten = a/10;
		int one = a%10;
		int cycle = 0;
		boolean c = true;
		List<Integer> arr = new ArrayList<>();
		
		for (int i = 0; ;i++) {
			if (cycle == 0) {
				arr.add((one*10) + ((one + ten)%10));
				cycle++;
				if (arr.get(i) == a) {
					break;
				}
			} else {
				arr.add(((arr.get(i-1)%10)*10) + ((arr.get(i-1)/10 + arr.get(i-1)%10))%10);
				cycle++;
				if (arr.get(i) == a) {
					break;
				}
			}
		}
		
		System.out.println(cycle);
		
		sc.close();

	}

}
