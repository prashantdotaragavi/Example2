package newtestone;

import java.util.Hashtable;

public class Hashtabling {

	public static void main(String[] args) {
		Hashtable<Integer,String> j = new Hashtable<Integer,String>();
		j.put (100,"Ram");
		j.put (898,"Sam");
		j.put (89988,"Slijam");
		j.put (198,"Dam");
		j.put (167,"Tam");
		System.out.println(j);
		System.out.println(j.get(898));
		System.out.println(j.values());
		System.out.println(j.keySet());
		

	}

}