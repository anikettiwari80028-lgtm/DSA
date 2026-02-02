package collection;

import java.util.Collection;
import java.util.LinkedHashSet;

public class program_3 {

	public static void main(String[] args) {

		Collection c1 = new LinkedHashSet();
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
