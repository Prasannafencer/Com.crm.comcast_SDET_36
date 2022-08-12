package own_practise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Database_utility;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;

public class Practice_create_contact_base_class {
	public WebDriver driver;
	
	 File_utility flib=new File_utility();
	public Database_utility dlib=new Database_utility();

	public webdriver_utility wlib= new webdriver_utility();


	
	Contact_page Clib=new Contact_page(driver);
	
	@BeforeSuite
public void contacthp()
{
System.out.println("Create contact");	
}
@BeforeClass
public void contactlb() {
	driver=new ChromeDriver();	
	
	}
@BeforeMethod
public void contatctlin() throws IOException
{
	//lunch the browser
	String url=flib.getPropertyKeyValue("url");
	String user=flib.getPropertyKeyValue("username");
	String pwd=flib.getPropertyKeyValue("password");
	
	driver.get(url);
	//login the application
	Login llib=new Login(driver);
	llib.logintoapp(user, pwd);
	}
//logout the apllication
@AfterMethod
public void conatctlout() {
	webdriver_utility wlib= new webdriver_utility();
	Homepage hlib=new Homepage(driver);
//

	wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
	wlib.ClickOnElement(driver, hlib.getsignout());
	System.out.println("logout sucesesfully");}
//close the application	
@AfterClass
	public void contactclose()
	{
		driver.close();
	}
	//close the application
@AfterSuite
public void conactas()
{
System.out.println("contact close");	
}

@Test
public void create_contact() throws Throwable
{
	Homepage hlib=new Homepage(driver);
	
	Excel_utility elib=new Excel_utility();
	String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
	hlib.clickcontact(driver);
	Contact_page Clib=new Contact_page(driver);
	Clib.clickcreate_contact(driver);
	
	Clib.enter_lastname(lastname);
	Clib.save_contact(driver);	
	String name=lastname;
	if( Clib.contact_information_text().contains(name)) {
		System.out.println("contact save sucesfully");
	}
	else
	{
		System.out.println("contact save not sucesfully");
		}

}
}








