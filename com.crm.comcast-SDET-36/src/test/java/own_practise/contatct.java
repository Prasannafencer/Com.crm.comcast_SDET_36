package own_practise;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Database_utility;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;
import com.crm.comcast.pomrepositylib.Product_page;
import com.crm.comcast.pomrepositylib.capaigns_page;
import com.google.common.collect.Iterators;

public class contatct {
	 WebDriver driver=new ChromeDriver();
	


	
	File_utility flib=new File_utility();
	Database_utility dlib=new Database_utility();
	Excel_utility elib=new Excel_utility();
	webdriver_utility wlib= new webdriver_utility();
	Login Llib=new Login(driver);
	Homepage hlib=new Homepage(driver);
	Product_page plib=new Product_page(driver);
	
	@BeforeClass
	public void openbrowser1() throws Throwable
	{
		File_utility flib=new File_utility();
		String url=flib.getPropertyKeyValue("url");
	driver.get(flib.getPropertyKeyValue("url"));
	
	
	
		
		//String user=flib.getPropertyKeyValue("username");
		//String pwd=flib.getPropertyKeyValue("password");
		
		Llib.logintoapp(flib.getPropertyKeyValue("username"), flib.getPropertyKeyValue("password"));
    System.out.println("login done");
    }	
	@Test(priority = 1)
	public void  clickcontact()
	{
	hlib.clickcontact(driver);
	}
	
	//WebElement nosouch=driver.findElement(By.xpath("//span[@class=\"genHeaderSmall\"]"));
	//String nosouchtext=driver.findElement(By.xpath("//span[@class=\"genHeaderSmall\"]")).getText();
	//System.out.println(nosouchtext);
	//String souch="No Contact Found";
	@Test(priority = 2)
	public void delete() {
	if(driver.findElement(By.xpath("//span[@class=\"genHeaderSmall\"]")).getText().contains("No Contact Found"))
	{
		System.out.println("deleted successfully");
	}
	else {
		System.out.println("deleted not successfully");
	}}
		
	@Test(priority = 3)
	public void getmore() {
	WebElement element=driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
	WebElement elements=driver.findElement(By.xpath("//a[@href=\"index.php?module=Users&action=Logout\"]"));

	wlib.ClickOnElement(driver, plib.getmorebutton());
	//plib.getmorebutton();
	plib.capaignsbutton(driver);}
	
	@Test(priority = 4)
	public void Addproduct()
	{
		capaigns_page calib=new capaigns_page(driver);
	calib.craetecapaigns(driver);		
	calib.Addproduct_textbox(driver);
	//String title=driver.getTitle();
	//System.out.println(title);
	//wlib.swithToWindow(driver, title);
	//String mainid=driver.getWindowHandle();
		//}
	}
	@Test(priority = 5)
	public void childwindow() {
	String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();
	// Here we will check if child window has other child windows and will fetch the heading of the child window
    while (iterator.hasNext()) {
        String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
            driver.switchTo().window(ChildWindow);
	
            driver.findElement(By.id("search_txt")).sendKeys("prasanna");
        	driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
            }}}
	 
	
    }
	
	//Actions act=new Actions(driver);
//act.moveToElement(element).perform();
//act.click(elements).perform();


//


    
	


