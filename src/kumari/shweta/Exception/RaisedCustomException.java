package kumari.shweta.Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RaisedCustomException {
	
	List<String> list = new ArrayList<String>(Arrays.asList("java","c"));
	public void checkedLanguage(String language) throws CustomCheckedException {
		try {
			if(list.contains(language)) {
				 throw new CustomCheckedException(language +"  All ready exist");
			} else {
				list.add(language);
				System.out.println(language +"is added in the ArrayList");
			}
		} catch (CustomCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
     RaisedCustomException obj = new RaisedCustomException();
   try {
    	 obj.checkedLanguage("DS");
    	 obj.checkedLanguage("java");
    	
     }catch (Exception e) {
		System.out.println("["+e+ "] Exception occured");
	}
	

      /* Here Error if we don't handle this exception in try cach block  --
     Unhandled exception type CustomCheckedException  
     
     obj.checkedLanguage("DS");
	 obj.checkedLanguage("java");
	 
	 */
		
	
	}

}
