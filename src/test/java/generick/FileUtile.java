package generick;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtile {
	
	static String propertyFilePath= "C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\base data.properties";
	public Properties getBaseData() throws IOException
	{
			FileInputStream fil = new FileInputStream(propertyFilePath);
			Properties pObj = new Properties();
			pObj.load(fil);
			return pObj;
	}
	

}
