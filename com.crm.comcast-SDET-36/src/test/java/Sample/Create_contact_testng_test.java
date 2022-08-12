package Sample;

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

import com.crm.comcast.genericutility.Baseclass;
import com.crm.comcast.genericutility.Database_utility;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;

public class Create_contact_testng_test extends Baseclass{
	
@Test(groups = "smoketesting")
public void create_contact() throws Throwable
{
	
	Homepage hlib=new Homepage(driver);
	
	Excel_utility elib=new Excel_utility();
	String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
	//click on the contact module
	hlib.clickcontact(driver);
	Contact_page Clib=new Contact_page(driver);
	//click on the create conatct 
	Clib.clickcreate_contact(driver);
	//enter the mandotriy last name
	Clib.enter_lastname(lastname);
	//click on save button
	Clib.save_contact(driver);	
	String name=lastname;
	if( Clib.contact_information_text().contains(name)) {
		System.out.println("contact save sucesfully");
	}
	else
	{
		System.out.println("contact save not sucesfully");}

}
}


