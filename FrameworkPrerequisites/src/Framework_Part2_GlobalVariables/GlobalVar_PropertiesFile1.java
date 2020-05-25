package Framework_Part2_GlobalVariables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVar_PropertiesFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties prop= new Properties();
		// to read file
		
			FileInputStream fis= new FileInputStream("E:\\Oxygen_FrameworkPrerequisites\\FrameworkPrerequisites\\GlobalVar_PropertiesFile.properties");
			prop.load(fis);
		
		
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		
		//Write to file
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		//Write to file
		FileOutputStream fos= new FileOutputStream("E:\\Oxygen_FrameworkPrerequisites\\FrameworkPrerequisites\\GlobalVar_PropertiesFile.properties");
		
		prop.store(fos, "null");
		System.out.println(prop.getProperty("browser"));
	}

}
