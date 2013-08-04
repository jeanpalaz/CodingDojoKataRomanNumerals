import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testRomanNumerals {

	private ConverterNumeralsToRoman converter;
	
	@Before
	public void init() {
		converter = new ConverterNumeralsToRoman(); 
	}
	
	@Test
	public void testConvert1() 
	{
		assertEquals("I", converter.convert(new Integer(1)));
	}

	@Test
	public void testConvert2()
	{
		assertEquals("II", converter.convert(new Integer(2)));
	}

	@Test
	public void testConvert4() 
	{
		assertEquals("IV", converter.convert(new Integer(4)));
	}
	
	@Test
	public void testConvert549() 
	{
		assertEquals("DXLIX", converter.convert(new Integer(549)));
	}
	
//	@Test
//	public void testConvert0() 
//	{
//		assertNull(converter.convert(new Integer(0)));
//	}
}
