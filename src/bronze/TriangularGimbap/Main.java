package bronze.TriangularGimbap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double gram = a / b;
		for (int i = 0; i < c; i++) {
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double gramO = d / e;
			if (gramO < gram) {
				gram = gramO;
			}
		}
		System.out.printf("%.2f",gram * 1000);
		
		sc.close();

	}

}
