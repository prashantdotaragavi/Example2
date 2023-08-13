package newtestone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9,a-z,A-Z]");
		Matcher m =  p.matcher("s5hs7kf73$%Fh&w(#kkj$k9");
		while (m.find()) {
			System.out.println(m.start()+ "...."+m.group());
		}
	}

}
