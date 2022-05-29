package bronze.ah;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String j = sc.next();
		String d = sc.next();
		char[] jArr = j.toCharArray();
		char[] dArr = d.toCharArray();
		
		if (jArr.length < dArr.length) {
			System.out.println("no");
		} else {
			System.out.println("go");
		}
		sc.close();
	}

}
