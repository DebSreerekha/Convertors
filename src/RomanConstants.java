/**
 * This class contains the constant values used in the Roman to Arabic conversion problem
 * 
 * @author sreerekha
 * date 22-May-2015
 */
 public class RomanConstants {

	public static int[] ARABIC_VALUES_ARRAY = {1,5,10,50,100,500,1000,5000,10000};
	public static String[] ROMAN_CONSTANTS_ARRAY = {"I","V","X","L","C","D","M","\u2181","\u2182"};
	
	public static final String ROMAN_ONE ="I";
	public static final String ROMAN_FIVE = "V";
	public static final String ROMAN_TEN ="X";
	public static final String ROMAN_FIFTY ="L";
	public static final String ROMAN_HUNDRED = "C";
	public static final String ROMAN_FIVEHUNDRED ="D";
	public static final String ROMAN_THOUSAND ="M";
	public static final String ROMAN_FIVETHOUSAND ="\u2181";
	public static final String ROMAN_TENTHOUSAND = "\u2182";
	
	public static enum ROMAN_CONSTANTS {
		ROMAN_ONE (1),
		ROMAN_FIVE(5),
		ROMAN_TEN(10),
		ROMAN_FIFTY(50),
		ROMAN_HUNDRED(100),
		ROMAN_FIVEHUNDRED(500),
		ROMAN_THOUSAND(1000),
		ROMAN_FIVETHOUSAND(5000),
		ROMAN_TENTHOUSAND(10000);
		private final int arabicValue;					
		private ROMAN_CONSTANTS(int value)
		{
			this.arabicValue = value;
		}
		public  int getValue()
		{
			return arabicValue;
		}
		
	};
	
	public static void main(String args[])
	{
		//ROMAN_CONSTANTS.values();
		ROMAN_CONSTANTS Romannumber = ROMAN_CONSTANTS.ROMAN_FIFTY ; 
		System.out.println(Romannumber.getValue());
	}
}