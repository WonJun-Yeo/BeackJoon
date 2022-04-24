package bronze.aPlusBMinusFive;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean c = true;
		while (c) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a + b != 0) {
				System.out.println(a + b);
			} else {
				c = false;
			}
		}
		sc.close();
	}
}
