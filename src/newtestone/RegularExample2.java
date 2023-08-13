package newtestone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExample2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]{10}");
		Matcher m =  p.matcher("6576876886576fhjhjg687989");
		while (m.find()) {
			System.out.println(m.start()+ "...."+m.group());
		}
	}

}
