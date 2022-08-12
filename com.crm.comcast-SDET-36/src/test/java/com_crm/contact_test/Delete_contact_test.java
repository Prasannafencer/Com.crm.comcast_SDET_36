package com_crm.contact_test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;
public class Delete_contact_test {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		Excel_utility elib=new Excel_utility();
		File_utility flib=new File_utility();
		webdriver_utility wlib=new webdriver_utility();
		Contact_page clib=new Contact_page(driver);
		Homepage hlib=new Homepage(driver);
		String url	=flib.getPropertyKeyValue("url");
		String user	=flib.getPropertyKeyValue("username");
		String pwd=flib.getPropertyKeyValue("password");
		driver.get(url);
		Login llib=new Login(driver);
		llib.logintoapp(user, pwd);
		String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
		System.out.println("login sucesfully");
		hlib.clickcontact(driver);
		clib.clickcreate_contact(driver);
		clib.enter_lastname(lastname);
		clib.save_contact(driver);	
		String name=lastname;
		if(clib.contact_information_text().contains(name)) {
			System.out.println("contact save sucesfully");
		}
		else
		{
			System.out.println("contact save not sucesfully");}
		hlib.clickcontact(driver);
		wlib.select(clib.getSearchfield(), 1);
		clib.Searchfor(lastname);
		clib.selectall(driver);
		clib.delete(driver);
		wlib.Robotpass_EnterKey();
		Thread.sleep(300);
		String souch="No Contact Found";
		if(clib.delete_information_text().contains(souch))
		{
			System.out.println("contact deleted successfully");
		}
		else {
			System.out.println("contact deleted not successfully");
		}
		wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
		wlib.ClickOnElement(driver, hlib.getsignout());
		System.out.println("logout sucsesfully");
		driver.close();
	}
}





















//driver.findElement(By.name("user_name")).sendKeys(user);
//driver.findElement(By.name("user_password")).sendKeys(pwd);
//driver.findElement(By.id("submitButton")).click();
//WebElement delete=clib.getDelete();
//delete.sendKeys(Keys.ENTER);

//WebElement delete= driver.findElement(By.xpath("//input[@title=\"Delete [Alt+D]\"]"));
//delete.click();
//delete.sendKeys(Keys.ENTER);
//WebElement search=driver.findElement(By.id("bas_searchfield"));
//Select list=new Select(search);
//list.selectByIndex(2);
//driver.findElement(By.xpath("//input[@class=\"txtBox\"]")).sendKeys("vishnu");
//driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("vishnu");
//WebElement alllist=driver.findElement(By.xpath("//select[@id=\"bas_searchfield\"]"));

//driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
//driver.findElement(By.name("selectall")).click();
//driver.findElement(By.className("crmbutton small delete"));
//java.awt.Robot r=new java.awt.Robot();
//r.keyPress(KeyEvent.VK_ENTER);
//WebElement c=driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]"));
//String ctext=c.getText();
//WebElement alllist=cslib.getSearchfield();
//Select in=new Select(alllist);
//in.selectByIndex(1);
//System.out.println("deleted succesfully");
//WebElement element=hlib.getlogoutbutton();
//WebElement element=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//WebElement elements=hlib.getsignout();
//WebElement elements=driver.findElement(By.xpath("//a[@href=\"index.php?module=Users&action=Logout\"]"));

// WebElement nosouch=driver.findElement(By.xpath("//span[@class=\"genHeaderSmall\"]"));
//WebElement nosouch=driver.findElement(By.xpath("//span[@class=\"genHeaderSmall\"]"));

//String nosouchtext=nosouch.getText();
//System.out.println(nosouchtext);
//Thread.sleep(10);



