package newtestone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExample3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z&&[^m-p]]");
		Matcher m =  p.matcher("dmnobcicjsidhsfdjdijkdpdp");
		while (m.find()) {
			System.out.println(m.start()+ "...."+m.group());
		}
	}

}
