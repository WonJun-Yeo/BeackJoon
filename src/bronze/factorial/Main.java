package bronze.factorial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mul = 1;
		if (a != 0) {
			for (int i = 1; i <= a; i++) {
				mul *= i;
			}
		}
		System.out.println(mul);
		sc.close();
	}
}
