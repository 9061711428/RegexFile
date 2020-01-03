package stringmethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String args[])
	{
	
		String content="Face- Focus Academy for career Enhancement-Face";
		String string="Face";
		Pattern pattern=Pattern.compile(string);//PatternClass used to define pattern
		Matcher matcher=pattern.matcher(content);//Matcher Class is used to Find the matching pattern
		while(matcher.find())
		{
			System.out.println("Found at:"+matcher.start()+"-"+(matcher.end()-1));
		}
		System.out.println(Pattern.matches("focu.", "focus"));
		System.out.println(Pattern.matches("face", "face"));
		System.out.println(Pattern.matches("fa*", "faa"));
		System.out.println(Pattern.matches("fa*e", "fake"));
	}

}
