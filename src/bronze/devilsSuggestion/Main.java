package bronze.devilsSuggestion;

import java.util.Scanner;

public class Main {
	// �ð� �ʰ� buffer ��Ʈ������ �ٲܰ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		
		if ((b-1)/(a*b) < 0) {
			System.out.println(-1);
		} else {
			for (long i = 0; ; i++) {
				long c = i - a;
				
				if(c * b >= i) {
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}

}
