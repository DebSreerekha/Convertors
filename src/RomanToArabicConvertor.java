import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class encapsulates the logic for converting the Roman numerals into the indo- Arabic format.
 * @author sreerekha
 * date 22-May-2015
 *
 */
public class RomanToArabicConvertor {
	private  HashMap<String,Integer> constantsMap ;
	
	
	/**
	 * The constructor which populates the ConstantsMap which contains the standard roman numerals .
	 */
	public RomanToArabicConvertor()
	{
		constantsMap = new HashMap<String,Integer>();
		int size = Constants.RomanConstantsArray.length ;
		int i = 0;
		while(i<size)
		{
			constantsMap.put(Constants.RomanConstantsArray[i],new Integer(Constants.ArabicValuesArray[i]));
			i++;
		}
	}
	/**
	 * This method converts the supplied string to an arabic number .
	 * 
	 * If the supplied roman string is valid only then we proceed to look it up in the ConstantsMap 
	 * if it is not present in it then we calculate it ..
	 * 
	 * @param str
	 * @return
	 */
	public  int convert(String str)
	{
		int intValue =0;
		
		if (isValid(str))
		{
			Integer value = constantsMap.get(str);
			
			if( value != null)
			{
				 intValue = value.intValue();
			}
			else //XXIX  XXXIX
			{
				int length = str.length();
				
				int lastKeyValue = 0;
				
				for(int j= length-1;j >=0;j--)
				{
					String key1 = ""+str.charAt(j);
					
					Integer val1 = constantsMap.get(key1);
					
					int currentKeyValue = val1.intValue();
					
					if(currentKeyValue >= lastKeyValue)
					{
						intValue += currentKeyValue ;
					}
					else
					{
						intValue -= currentKeyValue ;
					}
					lastKeyValue = currentKeyValue ;
				}
			}
		}
		else
		{
				intValue = -1;
		}
		return intValue;
	}
	/**
	 * This method checks if the supplied string is valid or not 
	 *  1) First it checks if the string contains valid characters ..
	 *  	
	 *  2) Then it checks if the sequence of the characters is valid .
	 * @param roman
	 * @return boolean
	 */
	private boolean isValid(String roman)
	{
		String pattern = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
		Pattern r = Pattern.compile(pattern);
		boolean validity = false;
		Matcher m = r.matcher(roman);
		if(m.find())
		{
	       validity = true;
	    } 
		return validity;
	}
	
	public static void main(String []args)
	{
		RomanToArabicConvertor converter = new RomanToArabicConvertor();
		
		System.out.println( converter.convert("XXIX"));
		System.out.println( converter.convert("MCMIX"));
		//System.out.println( converter.convert("II"));
		
	}
}


