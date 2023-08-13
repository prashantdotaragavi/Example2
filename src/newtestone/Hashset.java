package newtestone;

import java.util.HashSet;
import java.util.Iterator;

//import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(20);
		h.add(46);
		h.add(58);
		h.add(null);
		h.add(78);
		h.add(58);
		h.add(200);
		System.out.println(h);
		System.out.println(" ");
		Iterator<Integer> itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" ");
			for(Integer num:h) 
			System.out.println(num);
		
		

	}}

}
