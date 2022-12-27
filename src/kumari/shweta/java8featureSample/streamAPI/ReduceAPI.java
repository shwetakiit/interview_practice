package kumari.shweta.java8featureSample.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceAPI {

	public static void main(String[] args) {
		List<String> words =Arrays.asList("Geek","GFG","GeekForGeek","GeekQuiz");
		
		//Find the longest word from this list
		
		Optional<String> optional=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		String longestWord =optional.get();
		System.out.println("Longest word is "+longestWord);
		
		//Limit API 
		
		Stream.iterate(1, count->count+1).filter(number->number%3==0).limit(6).forEach(System.out::println);
		
	}
}
