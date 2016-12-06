package soundslike.helpers;

		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.InputStream;
		import java.util.Properties;

public class ConfigurationHelper {
	Properties list;
	InputStream inputStream;

	public ConfigurationHelper(){
		try{
			this.list = this.getPropertiesList();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}


	public Properties getPropertiesList() throws IOException {
		Properties output = null;
		try {
			Properties prop = new Properties();
			String propFileName = "configuration.properties";
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			output = prop;
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return output;
	}

	public String getPropertyValue(String key){
		return list.getProperty(key);
	}





}
