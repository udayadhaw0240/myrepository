package ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropetyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./data/conflic.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("url");
		System.out.println(value);

	}

}
