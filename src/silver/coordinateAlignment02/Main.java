package silver.coordinateAlignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			list.add(y);
			map.put(y, x);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(map.get(list.get(i)) + " " + list.get(i));
		}
		
		
		sc.close();

	}

}
