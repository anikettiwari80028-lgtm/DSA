package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class program_13_Iterator {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(12);
		l1.add(18);
		l1.add(15);
		System.out.println(l1);

		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
