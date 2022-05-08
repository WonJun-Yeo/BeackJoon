package bronze.numberOfValidations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int a2 = a*a;
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;
		int e2 = e*e;
		
		int sum = a2 + b2 + c2 + d2 + e2;
		System.out.println(sum%10);
		sc.close();
	}

}
