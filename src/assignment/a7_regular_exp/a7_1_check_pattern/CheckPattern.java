package assignment.a7_regular_exp.a7_1_check_pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println (Pattern.matches("^.@.com$", "firstname@gmail.com")); 
        System.out.println (Pattern.matches("^.@\\\\.com$", "virendra@gmail.com")); 
        System.out.println (Pattern.matches("^.@\\\\.com$", "test123prepare@co.edu.com")); 
	}

}
