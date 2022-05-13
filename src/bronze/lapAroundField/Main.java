package bronze.lapAroundField;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double pi = 3.141592;
		
		double c = (a * 2);
		double d = 2 * pi * b;
		
		double e = c + d;
		System.out.printf("%.6f%n", e);
		
		
		
		
		sc.close();
	}
}