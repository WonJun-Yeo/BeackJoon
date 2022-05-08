package bronze.afterParty;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int numb = a * b;
		
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		System.out.print(c - numb + " ");
		System.out.print(d - numb + " ");
		System.out.print(e - numb + " ");
		System.out.print(f - numb + " ");
		System.out.print(g - numb);
		sc.close();
	}
}
