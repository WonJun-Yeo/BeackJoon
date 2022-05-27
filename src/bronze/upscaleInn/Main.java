package bronze.upscaleInn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int s1 = sc.nextInt();
		int a2 = sc.nextInt();
		int s2 = sc.nextInt();
		
		int a = s2 / a1;
		int b = s1 / a2;
		
		if (a > b) {
			System.out.println("PLAYER B");
		} else if (b > a) {
			System.out.println("PLAYER A");
		} else {
			System.out.println("DRAW");
		}
		
		
		
		sc.close();
	}

}
