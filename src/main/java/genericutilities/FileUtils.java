package genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


	public class FileUtils {

		/**
		 * THIS METHOD IS USED TO READ DATA FROM PROPERTY FILE
		 * 
		 * @author NILESH
		 * @param key
		 * @return value to the provided key from properties file
		 * @throws IOException
		 */

		public String readDataFromPropertyFile(String key) throws IOException {
			FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
			Properties pobj = new Properties();
			pobj.load(fis);
			String value = pobj.getProperty(key);
			return value;
			
			
			// i am commenting something so that it gets updated
		}

	}
	

