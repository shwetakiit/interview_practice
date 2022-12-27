package kumari.shweta.json;

import org.json.simple.JSONObject;

public class JsonDemo {
	
	public static void main(String[] args) {
		
		JSONObject  obj = new JSONObject ();
		obj.put("Shweta",101);
		obj.put("ragini", 102);
		
		System.out.print(obj);
		
	}

}
