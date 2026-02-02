package collection;

import java.util.ArrayList;
import java.util.List;

public class Streamfirst {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(101);
		l.add(18);
		l.add(105);
		l.add(103);
		l.add(109);
		l.add(100);
		l.stream().forEach(n -> System.out.print(n+" ")); //print total elements
//		l.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));

	}

}
