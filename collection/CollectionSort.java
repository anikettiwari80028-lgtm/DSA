package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		Employ e1 = new Employ("aniket", 122, 23456.7);
		List<Employ> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(new Employ("abhi", 125, 1254.2));
		l1.add(new Employ("abhis", 128, 1754.2));
		l1.add(new Employ("abhish", 115, 1254.2));
		l1.add(new Employ("abhishe", 155, 1654.2));
		l1.add(new Employ("abhishek", 135, 1954.2));
		for (Employ e : l1) {
			System.out.println(e);
		}
		Collections.sort(l1, Comparator.comparingDouble((Employ e) -> e.salary).reversed());


}

	class Employ {
		String name;
		int id;
		double salary;

		Employ() {
		}

		Employ(String name, int id, double salary) {
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

		public String getDetails() {
			return "Name is: " + name + "\tID is: " + id + "\tSalary is: " + salary;
		}
	}
}
