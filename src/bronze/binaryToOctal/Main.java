package bronze.binaryToOctal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = Integer.parseInt(a, 2);
		String c = Integer.toOctalString(b);
		int d = Integer.parseInt(c);
		System.out.println(d);
		sc.close();
	}

}
