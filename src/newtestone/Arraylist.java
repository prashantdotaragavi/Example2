package newtestone;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		r.add(787);
		r.add(865);
		r.add(798);
		r.add(345);
		r.add(543);
		r.add(234);
		r.add(623);
		r.add(new Integer(8));
		System.out.println(r);
		r.set(5, 10);

		System.out.println(r);
		// System.out.println(r.contains(798));

	}

}
