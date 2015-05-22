import java.util.HashMap;


/**
 * This class encapsulates the logic for converting the Roman numerals into the indo- Arabic format.
 * @author sreerekha
 * date 22-May-2015
 *
 */
public class RomanToArabicConvertor {
	private  HashMap<String,Integer> ConstantsMap ;
	
	
	
	public RomanToArabicConvertor()
	{
		ConstantsMap = new HashMap<String,Integer>();
		int size = Constants.RomanConstantsArray.length ;
		int i = 0;
		while(i<size)
		{
			ConstantsMap.put(Constants.RomanConstantsArray[i],new Integer(Constants.ArabicValuesArray[i]));
			i++;
		}
	}
	
	public  int convert(String str)
	{
		Integer Value = ConstantsMap.get(str);
		int intValue =0;
		
		if( Value != null)
		{
			 intValue = Value.intValue();
		}
		return intValue;

	}

}
