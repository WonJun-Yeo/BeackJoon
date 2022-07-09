package silver.hanNum;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aw = 10;
		
		int cycle = sc.nextInt();
		
		if (cycle <= 10) {
			aw = cycle;
			System.out.println(cycle);
		} else {
			for (int k = cycle; k > 10; k--) {
				String str = Integer.toString(k);
				Set<Integer> list = new HashSet<>();
				
				char[] strArr = str.toCharArray();
				
				for (int i = 0; i < strArr.length - 1; i++) {
					int minu = (strArr[i] - '0') - (strArr[i+1] - '0');
					list.add(minu);
				}
				if (list.size() == 1) {
					aw++;
				}
			
			}
			System.out.println(aw);
			
		}
		sc.close();
	}

}
