package com.crm.comcast.genericutility;



	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
	import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	/**
	 * 
	 * @author vishnu
	 *
	 */

	public class File_utility {

		/**
		 * its used to read the data from commonData.properties File based on Key which you pass as an argument
		 * @param key
		 * @throws IOException 
		 * @throws Throwable 
		 */
	    public String getPropertyKeyValue(String key) throws IOException {
	    	 FileInputStream fis = new FileInputStream("./Data/Vtiger.properties");
	    	 Properties pobj = new Properties();
	    	 pobj.load(fis);
	    	 String value = pobj.getProperty(key);
			return value;
	    	
	    }
	    
					
					
		

	
}
