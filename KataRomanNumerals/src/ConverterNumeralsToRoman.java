import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *  Convertion ....
 *
 */
public class ConverterNumeralsToRoman {
	
	private final NavigableMap<Integer, String> mapConvertOrdered;
	
	public ConverterNumeralsToRoman()
	{
		final TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		map.put(1000, "M");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		mapConvertOrdered = map.descendingMap();
	}
	
	public String convert(final Integer numeral) 
	{
		StringBuilder roman = new StringBuilder();
		int remainsNumber = numeral;
		
		do {
			for ( Map.Entry<Integer, String> entry : mapConvertOrdered.entrySet()) 
			{
				if (remainsNumber >= entry.getKey()) {
				  roman.append(entry.getValue());
				  remainsNumber = remainsNumber - entry.getKey();
				  break;
				}
			}
		} while (remainsNumber>0);
		
		//System.out.println(mapConvertOrdered);
		return roman.toString(); 
 	}
}
