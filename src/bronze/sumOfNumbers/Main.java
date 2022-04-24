package bronze.sumOfNumbers;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String array1 = sc.next();
		int sum = 0;
		char[] array2 = array1.toCharArray();
		for (int i = 0; i < a; i++) {
			sum += Character.getNumericValue(array2[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}
