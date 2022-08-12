package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast.genericutility.File_utility;

public class Read_data_from_proerties_file_test {

	public static void main(String[] args) throws Throwable {
		File_utility flib=new File_utility();
		String url=flib.getPropertyKeyValue("url");
		//FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
		//Properties p=new Properties();
		//p.load(fis);
		String user=flib.getPropertyKeyValue("username");
		String pwd=flib.getPropertyKeyValue("password");
		
		//String url=p.getProperty("url");
		//String user=p.getProperty("username");
		//String pwd=p.getProperty("password");
		WebDriver driver=new ChromeDriver();
				driver.get(url);
				driver.findElement(By.name("user_name")).sendKeys(user);
				driver.findElement(By.name("user_password")).sendKeys(pwd);
				driver.findElement(By.id("submitButton")).click();
				System.out.println("login sucesfully");
				driver.close();
				
				
	}

}
