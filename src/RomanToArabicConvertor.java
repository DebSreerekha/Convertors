import java.util.HashMap;


/**
 * This class encapsulates the logic for converting the Roman numerals into the indo- Arabic format.
 * @author sreerekha
 * date 22-May-2015
 */
public class RomanToArabicConvertor {
	
	private  HashMap<String,Integer> constantsMap ;	
	
	/**
	 * The constructor which populates the ConstantsMap which contains the standard roman numerals .
	 */
	public RomanToArabicConvertor(){
		constantsMap = new HashMap<String,Integer>();
		int size = RomanConstants.ROMAN_CONSTANTS_ARRAY.length ;
		int i = 0;
		while(i<size){
			constantsMap.put(RomanConstants.ROMAN_CONSTANTS_ARRAY[i],new Integer(RomanConstants.ARABIC_VALUES_ARRAY[i]));
			i++;
			}
	}
	/**
	 * This method converts the supplied string to an arabic number .
	 * If the supplied roman string is valid only then we proceed to look it up in the ConstantsMap 
	 * if it is not present in it then we calculate the value of the Roman string..
	 * 
	 * @param romanNumeral
	 * @return
	 */
	public  int convert(String romanNumeral)
	{
		int arabicValue =0;
		
		if (RegExRomanValidator.validateRomanString(romanNumeral)){
			Integer value = constantsMap.get(romanNumeral);
			//int Value = RomanConstants.ROMAN_CONSTANTS.getValue(romanNumeral);
			
			if( value != null)
				arabicValue = value.intValue();
			else
				arabicValue = calculateArabicValue(romanNumeral);
		}
		else
			arabicValue = -1;
	
		return arabicValue;
	}
	/**
	 * This method calculates the arabic value for the roman string.
	 * 
	 * @param roman
	 * @return
	 */
	private int calculateArabicValue(String romanNumeral) {
		int arabicValue = 0;
		int length = romanNumeral.length();
		int lastKeyValue = 0;
	
		for(int j= length-1;j >=0;j--){
			String key1 = ""+romanNumeral.charAt(j);
			Integer val1 = constantsMap.get(key1);
			int currentKeyValue = val1.intValue();
		
			if(currentKeyValue< lastKeyValue)
				arabicValue -= currentKeyValue ;
			else
				arabicValue += currentKeyValue ;
		
			lastKeyValue = currentKeyValue ;
		}
		return arabicValue;
	}
}

