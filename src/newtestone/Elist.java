package newtestone;

import java.util.ArrayList;
//import java.util.List;

public class Elist {

	public static void main(String[] args) {
		ArrayList  a = new ArrayList();
		a.add(12);
		a.add(87);
		a.add(35.7);
		a.add("arun");
		a.add(true);
		a.add(new Integer (39));
		a.add(new String("anand"));
		a.add(new Double(56.87));
		
		for (Object object : a) {
		
		System.out.println(object);
		
	   }
	}
}
