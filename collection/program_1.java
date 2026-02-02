package collection;

import java.util.ArrayList;
import java.util.Collection;

public class program_1 {

	public static void main(String[] args) {
		int[] a = new int[1000];
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(12);
		c1.add(18);
		c1.add(15);
		c1.add(17);
		c1.add(10);
		c1.add(12);

		System.out.println(c1);

	}

}
