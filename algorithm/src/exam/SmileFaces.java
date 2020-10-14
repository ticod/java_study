package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        System.out.println(SmileFaces.countSmileys(a));
	}
	public static int countSmileys(List<String> arr) {
		String regex = "[:;][-~]?[)D]";
		Pattern p = Pattern.compile(regex);
		Matcher m = null;
		int count = 0;
		for (String s : arr) {
			System.out.println(s);
			System.out.println(p);
			System.out.println(count);
			m = p.matcher(s);
			if (m.matches()) {
				count++;
			}
		}
		
		return count;
	}
}
