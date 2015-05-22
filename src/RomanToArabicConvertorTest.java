

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
	public void testConvertI() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("I") ;
		assertEquals(1,value);
	}
	/*@Test
	public void testConvertII() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("II") ;
		assertEquals(2,value);
	}
	@Test
	public void testConvertIII() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("III") ;
		assertEquals(3,value);
	}
	*/
	@Test
	public void testConvertIV() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("IV") ;
		assertEquals(4,value);
	}
	@Test
	public void testConvertV() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("V") ;
		assertEquals(5,value);
	}
	/*@Test
	public void testConvertVI() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("VI") ;
		
		assertEquals(6,value);
	}
	@Test
	public void testConvertVII() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("VII") ;
		assertEquals(7,value);
	}
	@Test
	public void testConvertVIII() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("VIII") ;
		assertEquals(8,value);
	}*/
	@Test
	public void testConvertIX() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("IX") ;
		assertEquals(9,value);
	}
	@Test
	public void testConvertX() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("X") ;
		assertEquals(10,value);
	}
	/*@Test
	public void testConvertXI() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("XI") ;
		assertEquals(11,value);
	}
	@Test
	public void testConvertXII() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("XII") ;
		assertEquals(12,value);
	}*/
	@Test
	public void testConvertXL() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("XL") ;
		assertEquals(40,value);
	}
	@Test
	public void testConvertL() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("L") ;
		assertEquals(50,value);
	}
	@Test
	public void testConvertXC() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("XC") ;
		assertEquals(90,value);
	}
	@Test
	public void testConvertC() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("C") ;
		assertEquals(100,value);
	}
	@Test
	public void testConvertCD() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("CD") ;
		assertEquals(400,value);
	}
	@Test
	public void testConvertD() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("D") ;
		assertEquals(500,value);
	}
	@Test
	public void testConvertCM() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("CM") ;
		assertEquals(900,value);
	}
	@Test
	public void testConvertM() {
		
		RomanToArabicConvertor convertor = new  RomanToArabicConvertor();
		int  value = convertor.convert("M") ;
		assertEquals(1000,value);
	}

}
