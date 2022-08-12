package own_practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;

public class Test_base_class extends Practice_create_contact_base_class {
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
			System.out.println("contact save not sucesfully");}

	}

}
