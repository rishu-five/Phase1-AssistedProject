package AssistedProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String name="This is an example for regular expressions";
		String regularExpn="\\b\\w*regular\\w*\\b";
		Pattern pattern= Pattern.compile(regularExpn);
		Matcher matcher=pattern.matcher(name);
		System.out.println("Examples : ");
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		boolean matchingText=matcher.matches();
		System.out.println("Entire text matches: "+matchingText);

	}

}
