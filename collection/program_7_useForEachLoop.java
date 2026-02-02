package collection;

import java.util.ArrayList;
import java.util.List;

public class program_7_useForEachLoop {
	public static void main(String[] args) {

		List l1 = new ArrayList();
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
		l1.add(17);
		l1.add(10);
		l1.add(12);
		System.out.println(l1);
		System.out.println("=================");
		for (Object n : l1) {
			System.out.println(n);
		}
	}
}
