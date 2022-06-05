package silver.sugarDelivery;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1666;
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j < 1667; j++) {
				if ((i * 5) + (j *3) == a) {
					if (i + j < b) {
						b = i + j;
					}
				}
			}
		}
		if (b == 1666) {
			b = -1;
		}
		System.out.println(b);
		sc.close();
	}
}
