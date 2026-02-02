package collection;

import java.util.ArrayList;
import java.util.List;

public class program_9_generic {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
		l1.add(17);
		l1.add(10);
		l1.add(12);
		System.out.println(l1);
		System.out.println("=================");
		for (int n : l1) {
			System.out.println(n);
		}
	}

}
