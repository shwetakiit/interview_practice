package kumari.shweta.FilePOC;

import java.io.File;
import java.lang.reflect.GenericArrayType;

public class FilePOC {
	
	public static void main(String[] args) {
		
		File file = new File("testFile.txt");
		System.out.println("File Name is "+file.getName());
		System.out.println("Parent path name "+file.getParent());
		System.out.println("Get path of file"+file.getPath()+"Absolute path"+file.getAbsolutePath());

	}

}
