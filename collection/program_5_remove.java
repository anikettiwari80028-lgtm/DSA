package collection;

import java.util.Collection;
import java.util.PriorityQueue;

public class program_5_remove {

	public static void main(String[] args) {
		
		Collection c1=new PriorityQueue();
		c1.add(10);c1.add(12);c1.add(18);c1.add(15);
		c1.add(17);c1.add(5);c1.add(10);c1.add(12);
		System.out.println(c1);
		c1.remove(5);
		System.out.println(c1);
	}

}
