package bronze.numberOfWords;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if (str.equals(" ")) {
			System.out.println(0);
		} else {
			
			String strTrim = str.trim();
			String[] strArr = strTrim.split("\\s");
			
			System.out.println(strArr.length);
		}
		sc.close();
	}
}
