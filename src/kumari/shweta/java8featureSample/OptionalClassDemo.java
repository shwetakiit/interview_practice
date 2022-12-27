package kumari.shweta.java8featureSample;

import java.util.Optional;
public class OptionalClassDemo {
	
	public static void main(String[] args) {
		
		String[] str = new String[10];
		
		/* BelowOp code will throw null Pointer exception due data 
		 * is not available at 9 index 
		 */
		//str[9]="ShwetaKumari";
		
	//String str2 = str[9].substring(2,5);
	//System.out.println("Str2 will throw null pointer exception"+str2);
		
    //Create object of Optional which can be null and notnull 

		Optional<String> isNull = Optional.ofNullable(str[9]);//Optiona.empty if data is there it will return Optional[data]
        System.out.println("Optional object is "+isNull);
        System.out.println("is string empty" +isNull.isEmpty());
        System.out.println("Is presnt string"+isNull.isPresent());
        System.out.println(isNull.orElse("str[9] is empty value"));
        System.out.println(isNull.orElseGet(()->"No get value "));
		
        if(isNull.isPresent()) {
			
			System.out.println("str at index 9 is "+str[9]);
			
		} else {
			System.out.println("There is no string at index 9"+  str[9]);
		}
        
        
		str[9]="ShwetaKumari";
		
		//Create object using of if value is not null else null pointer exception 
		//Optional<String> optional = Optional.of(str[8]);
		
		Optional<String> optional = Optional.of(str[9]);
		System.out.println(optional.get());
		
		
		//Create object with value can be null/notnull 
		//str[8]="nickee";
		Optional<String> obj2 = Optional.ofNullable(str[8]);
		System.out.println("value at index 8 is  "+  str[8]);
		
		//Create object with empty()
		
		Optional<Integer> iOptional = Optional.empty();
		//System.out.println(iOptional.get()); --will throw null pointer exception
		if(iOptional.isPresent()) {
			System.out.println(iOptional.get());
		} else {
			System.out.println("No value present for object iOptinal");
		}
		
      System.out.println("IS iOptional object empty "+iOptional.isEmpty());
      optional.ifPresent(s->System.out.println("IfPresent print value "+optional.get()));
      isNull.ifPresentOrElse(s->System.out.println(isNull.get()), ()->System.out.println("Optional opbject is emty"));
      

		
	}

}
