package bronze.aboveAverage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] arr1 = new double[a];
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int[] arr2 = new int[b];
			for (int j = 0; j < b; j++) {
				int c = sc.nextInt();
				arr2[j] = c;
			}
			
			int sum = 0;
			
			for (int j = 0; j < b; j++) {
				sum += arr2[j];
			}
			
			double avg = (double) sum / b;
			
			double num = 0;
			
			for (int j = 0; j < b; j++) {
				if (avg < arr2[j]) {
					num++;
				}
			}
		}
		
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(String.format("%.3f",arr1[j]) + "%");
		}
		
		sc.close();
	}

}
