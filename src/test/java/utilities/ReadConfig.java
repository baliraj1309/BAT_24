package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	String path="config.properties";
	// default constructor
	public ReadConfig() throws Exception {
		
		properties=new Properties();
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	}
	
	//User defined method
	
	public String getBrowser() {   //Calling getBrowser() >edge
		String value=properties.getProperty("browser");//edge
		
		if(value!=null) {
			return value;//edge
		}else {
			throw new RuntimeException("Browser is not found in config file");
		}
	}
}
