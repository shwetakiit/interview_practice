package kumari.shweta;

public class HtmlDecodeInJava {
	
	public static void main(String[] args) {
		 String escapedString = "&lt;java&gt;public static void main(String[] args) { ... }&lt;/java&gt;";
		 String unEscapedHTML = StringEscapeUtils.unescapeHtml4(escapedString);
	}

}
