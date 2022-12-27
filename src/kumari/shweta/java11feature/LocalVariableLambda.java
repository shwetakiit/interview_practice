package kumari.shweta.java11feature;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class LocalVariableLambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Kotlin","c");
		String string=	list.stream().map((var x)  ->x.toUpperCase()).collect(Collectors.joining("*"));
		System.out.println(string);
}

}
