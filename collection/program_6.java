package collection;

import java.util.ArrayList;
import java.util.List;

public class program_6 {

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
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		System.out.println("===============");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}
}
