package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class program_18_Iterator_remove {

	public static void main(String[] args) {
		List<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(13);
		c1.add(17);
		c1.add(16);
		c1.add(24);
		System.out.println("Before: " + c1);
		Iterator<Integer> itr = c1.iterator();
		while (itr.hasNext()) {
			int x = itr.next();
			if (x % 2 == 0)
				itr.remove();
		}
		System.out.println("After : " + c1);
	}


}
