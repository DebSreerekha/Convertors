

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This class encapsulates the junit test cases for testing the convertor class
 * @author sreerekha
 * date 22-May-2015
 *
 */
public class RomanToArabicConvertorTest {

	@Test
	public void  checkConversionForRomanOne() {
		assertEquals(1,new RomanToArabicConvertor().convert("I"));
	}
	@Test
	public void  checkConversionForRomanTwo() {
		assertEquals(2,new RomanToArabicConvertor().convert("II"));
	}
	@Test
	public void  checkConversionForRomanThree() {
		assertEquals(3,new RomanToArabicConvertor().convert("III"));
	}
	@Test
	public void  checkConversionForRomanFour() {
		assertEquals(4,new RomanToArabicConvertor().convert("IV"));
	}
	@Test
	public void  checkConversionForRomanFive() {
		assertEquals(5,new RomanToArabicConvertor().convert("V"));
	}
	@Test
	public void  checkConversionForRomanSix() {
		assertEquals(6,new RomanToArabicConvertor().convert("VI"));
	}
	@Test
	public void  checkConversionForRomanSeven() {
		assertEquals(7,new RomanToArabicConvertor().convert("VII"));
	}
	@Test
	public void  checkConversionForRomanEight() {
		assertEquals(8,new RomanToArabicConvertor().convert("VIII"));
	}
	@Test
	public void  checkConversionForRomanNine() {
		assertEquals(9,new RomanToArabicConvertor().convert("IX"));
	}
	@Test
	public void  checkConversionForRomanTen() {
		assertEquals(10,new RomanToArabicConvertor().convert("X"));
	}
	@Test
	public void  checkConversionForRomanEleven() {
		assertEquals(11,new RomanToArabicConvertor().convert("XI"));
	}
	@Test
	public void  checkConversionForRomanTwelve() {
		assertEquals(12,new RomanToArabicConvertor().convert("XII"));
	}
	@Test
	public void  checkConversionForRomanThirteen() {
		assertEquals(13,new RomanToArabicConvertor().convert("XIII"));
	}@Test
	public void  checkConversionForRomanFourteen() {
		assertEquals(14,new RomanToArabicConvertor().convert("XIV"));
	}
	@Test
	public void  checkConversionForRomanFifteen() {
		assertEquals(15,new RomanToArabicConvertor().convert("XV"));
	}@Test
	public void  checkConversionForRomanSixteen() {
		assertEquals(16,new RomanToArabicConvertor().convert("XVI"));
	}
	@Test
	public void  checkConversionForRomanSeventeen() {
		assertEquals(17,new RomanToArabicConvertor().convert("XVII"));
	}
	@Test
	public void  checkConversionForRomanEighteen() {
		assertEquals(18,new RomanToArabicConvertor().convert("XVIII"));
	}
	@Test
	public void  checkConversionForRomanNineteen() {
		assertEquals(19,new RomanToArabicConvertor().convert("XIX"));
	}@Test
	public void  checkConversionForRomanTwenty() {
		assertEquals(20,new RomanToArabicConvertor().convert("XX"));
	}
	@Test
	public void  checkConversionForRomanTwentyOne() {
		assertEquals(21,new RomanToArabicConvertor().convert("XXI"));
	}@Test
	public void  checkConversionForRomanTwentyTwo() {
		assertEquals(22,new RomanToArabicConvertor().convert("XXII"));
	}
	@Test
	public void  checkConversionForRomanFifty() {
		assertEquals(50,new RomanToArabicConvertor().convert("L"));
	}@Test
	public void  checkConversionForRomanForty() {
		assertEquals(40,new RomanToArabicConvertor().convert("XL"));
	}
	@Test
	public void  checkConversionForRomanHundred() {
		assertEquals(100,new RomanToArabicConvertor().convert("C"));
	}	
	@Test
	public void  checkConversionForRomanNinety() {
		assertEquals(90,new RomanToArabicConvertor().convert("XC"));
	}
	@Test
	public void  checkConversionForRomanFiveHundred() {
		assertEquals(500,new RomanToArabicConvertor().convert("D"));
	}
	@Test
	public void  checkConversionForFourHundred() {
		assertEquals(400,new RomanToArabicConvertor().convert("CD"));
	}
	@Test
	public void  checkConversionForRomanNineHundred() {
		assertEquals(900,new RomanToArabicConvertor().convert("CM"));
	}
	@Test
	public void  checkConversionForRomanThousand() {
		assertEquals(1000,new RomanToArabicConvertor().convert("M"));
	}
	@Test
	public void  checkConversionForRomanThreethousand() {
		assertEquals(3000,new RomanToArabicConvertor().convert("MMM"));
	}
	@Test 
	public void  checkConversionForRomanFivethousand() {
		assertEquals(5000,new RomanToArabicConvertor().convert("ↁ"));
	}
	@Test
	public void  checkConversionForRomanFourthousand() {
		assertEquals(4000,new RomanToArabicConvertor().convert("Mↁ"));
	}
	@Test
	public void  checkConversionForRomanNinethousand() {
		assertEquals(9000,new RomanToArabicConvertor().convert("Mↂ"));
	}
	@Test
	public void  checkConversionForRomanTenthousand() {
		assertEquals(10000,new RomanToArabicConvertor().convert("ↂ"));
	}
	@Test 
	public void  checkConversionForRomanFivethousandUsingUnicode() {
		assertEquals(5000,new RomanToArabicConvertor().convert("\u2181"));
	}
	@Test
	public void  checkConversionForRomanFourthousandusingUnicode() {
		assertEquals(4000,new RomanToArabicConvertor().convert("M\u2181"));
	}
	@Test
	public void  checkConversionForRomanNinethousandUsingUnicode() {
		assertEquals(9000,new RomanToArabicConvertor().convert("M\u2182"));
	}
	@Test
	public void  checkConversionForRomanTenthousandUsingUnicode() {
		assertEquals(10000,new RomanToArabicConvertor().convert("\u2182"));
	}
	
	/**
	 * the following tests should are to check invalid data 
	 */
	@Test
	public void  checkNegativeConversionForFour() {
		assertEquals(-1,new RomanToArabicConvertor().convert("IIII"));
	}
	@Test
	public void  checkNegativeConversionForFourHundred() {
		assertEquals(-1,new RomanToArabicConvertor().convert("CCCC"));
	}
	@Test
	public void  checkNegativeConversionForFourThousand() {
		assertEquals(-1,new RomanToArabicConvertor().convert("MMMM"));
	}
	/**
	 * the following tests are for random and right versions of the  roman numbers
	 */
	@Test
	public void  checkConversionForRight1909() {
		assertEquals(1909,new RomanToArabicConvertor().convert("MCMIX"));
	}
	@Test
	public void  checkConversionForRight1903() {
		assertEquals(1903,new RomanToArabicConvertor().convert("MCMIII"));
	} 
	@Test
	public void  checkConversionForRandom1910() {
		assertEquals(-1,new RomanToArabicConvertor().convert("MDCCCCX"));
	}
	@Test
	public void  checkConversionForRandom1903() {
		assertEquals(-1,new RomanToArabicConvertor().convert("MDCDIII"));
	}
	
}
