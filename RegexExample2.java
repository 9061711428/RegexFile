package stringmethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("Fa[a-z]e");// [a-z] is a character class ranging from a to z
		Matcher m = pattern.matcher("Fake");// Matcher class used to find matching string
		if (m.find())
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(Pattern.matches("Fa[ac]e", "Fabe"));// character ranging form a to c
		System.out.println(Pattern.matches("Do\\[","Do[")); 
		System.out.println(Pattern.matches("Do[\\[\\]]", "Do]"));
		System.out.println(Pattern.matches("Hi\\d", "Hi5"));
		System.out.println(Pattern.matches("Hi\\D", "Hi5"));
		System.out.println(Pattern.matches("Hello\\sWorld", "Hello World"));
		System.out.println(Pattern.matches("Hello\\SWorld", "Hello World"));
		System.out.println(Pattern.matches("Hi\\wWorld", "Hi5World"));
		System.out.println(Pattern.matches("Hi\\WWorld", "Hi5World"));
		Pattern p1 = Pattern.compile("\\A[a-zA-Z]");// range of character from a to z
		Matcher m1 = p1.matcher("Be strong");
		while (m1.find())
			System.out.println(m1.group());

	}

}
