package own_practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("username");
		String pwd=p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		System.out.println("login sucesfully");
	WebElement re=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
	Actions as= new Actions(driver);
	as.moveToElement(re).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	System.out.println("logout sucessfully");
	}

}
