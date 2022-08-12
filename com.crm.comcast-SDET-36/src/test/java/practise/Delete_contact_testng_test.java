package practise;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;


public class Delete_contact_testng_test extends Baseclass {
	
		@Test(priority = 1)
		public void createcontact() throws Throwable {
			Contact_page clib=new Contact_page(driver);
			Homepage hlib=new Homepage(driver);
				
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
			System.out.println("contact save not sucesfully");
			}
		}
		@Test(priority = 2)
		public void delecontaact() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
			
			String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
			Contact_page clib=new Contact_page(driver);
			Homepage hlib=new Homepage(driver);
			
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
		}	System.out.println("logout sucsesfully");
		
	
		}
	
		
	}


