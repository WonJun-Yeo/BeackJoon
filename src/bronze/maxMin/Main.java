package bronze.maxMin;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		int array[] = new int[a];
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			array[i] = b;
		}
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.print(min + " " + max);
		sc.close();
	}
}
