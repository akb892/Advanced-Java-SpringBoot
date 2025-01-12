package exercise7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo {
	public static void main(String[] args) {
		//String str="([A-Z])(.+)";
		String str="[AZ[a-z](a-z)";
		try {
			Pattern p=Pattern.compile(str);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException e) {
			System.out.println("Invalid");
		}
		
			
		
	}
}
