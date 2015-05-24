import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains the logic for validating the roman string using regular expressions
 * @author sreerekha
 *
 */
public class RegExRomanValidator {
	/**
	 * This method checks if the supplied string is valid or not 
	 *  1) First it checks if the string contains valid characters ..
	 *  	
	 *  2) Then it checks if the sequence of the characters is valid .
	 * @param roman
	 * @return boolean
	 */
	public static boolean validateRomanString(String roman)
	{
		String pattern =  "^\u2182{0,3}(M\u2182|M\u2181|\u2181?M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
		Pattern r = Pattern.compile(pattern);
		boolean validity = false;
		Matcher m = r.matcher(roman);
		if(m.find())
		{
	       validity = true;
	    } 
		return validity;
	}

}

