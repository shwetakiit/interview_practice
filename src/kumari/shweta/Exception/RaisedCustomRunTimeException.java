/**
 * 
 */
package kumari.shweta.Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shweta kumari
 *
 */
public class RaisedCustomRunTimeException {
	
	List<String> list = new ArrayList<String>(Arrays.asList("java","c"));
	public void checkLanguage(String language) // now need to throws CustomRunTimeException
	{
		if(list.contains(language)) {
			throw new CustomRunTimeException(language+" Allready exist");
		} else {
			list.add(language);
			System.out.println(language +"Added Successfully");
			
		}
	}
	public static void main(String[] args) {
		RaisedCustomRunTimeException obj = new RaisedCustomRunTimeException();
		/*no throws so we are not handling this exception --its not mandatory to handle ,
		if exception rased handle by mail method */

		//Exception handled by main method
		obj.checkLanguage("Kotlin");
		obj.checkLanguage("java");
	
	}
	
}
