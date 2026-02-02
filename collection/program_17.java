package collection;

import java.util.ArrayList;
import java.util.List;

public class program_17 {

	public static void main(String[] args) {
		List<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(13);
		c1.add(17);
		c1.add(16);
		c1.add(24);
		System.out.println(c1);
		for (Integer n : c1) {
			if (n % 2 == 1)
				c1.remove(n);
		}
		System.out.println(c1);

	}

}
