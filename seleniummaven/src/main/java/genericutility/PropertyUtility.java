package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public  String readingDtaFromPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/credential.properties"); 
		 Properties property= new Properties();
		 property.load(fis);
		 String value = property.getProperty(key);
		 return value;
	}

}
