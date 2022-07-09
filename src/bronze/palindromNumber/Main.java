package bronze.palindromNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if (str.equals("0")) break;
			
			char[] arr = str.toCharArray();
			List<char[]> list = Arrays.asList(arr);
			
		}
		
		sc.close();
	}

}
