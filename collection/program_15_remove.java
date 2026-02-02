package collection;

import java.util.ArrayList;
import java.util.Collection;

public class program_15_remove {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(12);
		c1.add(18);
		c1.add(15);
		System.out.println(c1);
		c1.remove(18);
		c1.remove(100);
		System.out.println(c1);
	}

}
