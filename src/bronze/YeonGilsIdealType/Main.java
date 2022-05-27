package bronze.YeonGilsIdealType;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] arr = a.toCharArray();
		if (arr[0] == 'E') {
			System.out.print("I");
		} else {
			System.out.print("E");
		}
		if (arr[1] == 'S') {
			System.out.print("N");
		} else {
			System.out.print("S");
		}
		if (arr[2] == 'T') {
			System.out.print("F");
		} else {
			System.out.print("T");
		}
		if (arr[3] == 'J') {
			System.out.print("P");
		} else {
			System.out.print("J");
		}
		
		
		sc.close();
	}

}
