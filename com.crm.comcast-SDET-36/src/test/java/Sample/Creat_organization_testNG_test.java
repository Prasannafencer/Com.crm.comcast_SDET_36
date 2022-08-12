package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;
import com.crm.comcast.pomrepositylib.Organization_page;
import com.crm.comcast.pomrepositylib.Product_page;

public class Creat_organization_testNG_test extends Baseclass {
	@Test
	public void Creatorganization() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		Excel_utility elib=new Excel_utility();
		File_utility flib=new File_utility();
		webdriver_utility wlib=new webdriver_utility();
		Product_page plib=new Product_page(driver);
		Homepage hlib=new Homepage(driver);
		String expected=elib.getDataFromExcel("Sheet1", 0, 0);
		System.out.println(expected);
hlib.Click_on_Organizations(driver);
Organization_page olib=new Organization_page(driver);
olib.create_Organization(driver);
olib.Organization_Name("expected4");
olib.save_button(driver);
String text=olib.getOrganization_info().getText();
System.out.println(olib.getOrganization_info());
						if(text.contains("expected4"))
				{
					System.out.println("Organization creation sucssefully");
				}
				else
				{
					System.out.println("Organization creation not-sucssefully");
				}
				}

}
