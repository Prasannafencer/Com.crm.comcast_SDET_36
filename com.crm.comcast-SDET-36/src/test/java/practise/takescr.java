package practise;
import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class takescr {


	    @Test

	    public void testGuru99TakeScreenShot() throws Exception{

			WebDriver driver = new ChromeDriver();
	    	

	        
	        driver.get("http://demo.guru99.com/V4/");

	        EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	        Files srcfile=edriver.getScreenshotAs("./com.crm.comcast-SDET-36/takescren_shote/images");
	        try
	        {
	        	
	        	FileUtils.copyFile
	        }
	        
	        this.takeSnapShot(driver, "c://test.png") ;     

	    }

	    
	    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	    
	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	    
	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	    
	                File DestFile=new File(fileWithPath);

	    
	                FileUtils.copyFile(SrcFile, DestFile);

	    }

	}


