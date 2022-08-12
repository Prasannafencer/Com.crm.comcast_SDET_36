package Sample;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Product_page;
import com.crm.comcast.pomrepositylib.capaigns_page;

public class Create_Compaign_testNG_test extends Baseclass {
	@Test(groups="regresion testing",priority = 1)
	public void Create_compaign() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
		Product_page plib=new Product_page(driver);
		Homepage hlib=new Homepage(driver);
		hlib.click_product(driver);
		String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
		plib.click_on_create_product(driver);
		plib.lastname_textbox(lastname);
		plib.savebutton(driver);
	System.out.println("Product save succesfully");	
	}
	@Test(groups = "smoke testing", priority = 2)
public void createCampaigns() throws Throwable {
		String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
		Product_page plib=new Product_page(driver);
		
		wlib.ClickOnElement(driver, plib.getmorebutton());
		//plib.getmorebutton();
		plib.capaignsbutton(driver);
     capaigns_page calib=new capaigns_page(driver);
		calib.craetecapaigns(driver);	
		String mainid=driver.getWindowHandle();
		calib.Addproduct_textbox(driver);
		wlib.swithTo_child_Window(driver);
		calib.childwindow_searchTtxtbox(lastname);
		calib.childwindow_searchbutton(driver);
		calib.select_product_name(driver);
     driver.switchTo().window(mainid);
     calib.capaigns_name_textbox(lastname);
		calib.campaigns_save_button(driver);
     if(calib.capaigns_text_info().contains(lastname))
		{System.out.println("campagins sucessfully created");}
		else
		{System.out.println("campagins sucessfully not created");}
     }

}
