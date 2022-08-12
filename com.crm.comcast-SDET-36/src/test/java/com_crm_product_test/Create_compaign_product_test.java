package com_crm_product_test;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.crm.comcast.genericutility.Database_utility;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Contact_page;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;
import com.crm.comcast.pomrepositylib.Product_page;
import com.crm.comcast.pomrepositylib.capaigns_page;

public class Create_compaign_product_test {
public static void main(String[] args) throws Throwable {
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		//get data from excel
		Excel_utility elib=new Excel_utility();
		//get data from notepad
		File_utility flib=new File_utility();
		//get driver methods from webdriver utility
		webdriver_utility wlib=new webdriver_utility();
		//get contact page
		
	Product_page plib=new Product_page(driver);
		//get the property from the prperty file
		Homepage hlib=new Homepage(driver);
		String url	=flib.getPropertyKeyValue("url");
		String user	=flib.getPropertyKeyValue("username");
		String pwd=flib.getPropertyKeyValue("password");
		driver.get(url);
		Login llib=new Login(driver);
		llib.logintoapp(user, pwd);
		System.out.println("login sucesfully");
		//click in the product module in present the home page
		hlib.click_product(driver);
		//get the values from the excel file
		String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
		//click on create the product in product page
		plib.click_on_create_product(driver);
		//pass the lastname in mandotry filed in prodcut page
		plib.lastname_textbox(lastname);
		//click on the save button
		plib.savebutton(driver);
		//click on the more button in home page
        wlib.ClickOnElement(driver, plib.getmorebutton());
		//click on capaigs in getmore option();
		plib.capaignsbutton(driver);
        //click on  the create the capagins button in capagins page
		capaigns_page calib=new capaigns_page(driver);
		
		calib.craetecapaigns(driver);	
		//get child window handle
		String mainid=driver.getWindowHandle();
		//send the values in child window test box
		calib.Addproduct_textbox(driver);
		//switch to child window handle
		wlib.swithTo_child_Window(driver);
	//enter the mandotry values in child window text box
		calib.childwindow_searchTtxtbox(lastname);
		//click on the search button in childwindow
		calib.childwindow_searchbutton(driver);
		//select the product name which is present  in childwindow
		calib.select_product_name(driver);
        //switch to mainwindow
		driver.switchTo().window(mainid);
		//enter the last name in mandotryfiled
        calib.capaigns_name_textbox(lastname);
		//click in save button in campaign page
        calib.campaigns_save_button(driver);
		//check the condition save the campaign is suceesfully or not
        if(calib.capaigns_text_info().contains(lastname))
		{System.out.println("sucessfully created");}
		else
		{System.out.println("sucessfully not created");}
        //logout the brower
		wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
		wlib.ClickOnElement(driver, hlib.getsignout());
		System.out.println("logout sucesesfully");
		//close the browser
		driver.close();
		}
        }

	// TODO Auto-generated method stub
	//File_utility flib=new File_utility();
	//Database_utility dlib=new Database_utility();
	//Excel_utility elib=new Excel_utility();
	//webdriver_utility wlib= new webdriver_utility();
	//WebDriver driver=new ChromeDriver();
	//String url=flib.getPropertyKeyValue("url");
	//String user=flib.getPropertyKeyValue("username");
	//String pwd=flib.getPropertyKeyValue("password");
	//FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
	//Properties p=new Properties();
	//p.load(fis);
	//String url=p.getProperty("url");
	//String user=p.getProperty("username");
	//String pwd=p.getProperty("password");
	//ebDriver driver=new ChromeDriver();
	//driver.get(url);
	//driver.findElement(By.name("user_name")).sendKeys(user);
	//driver.findElement(By.name("user_password")).sendKeys(pwd);
	//driver.findElement(By.id("submitButton")).click();
	//System.out.println("login sucesfully");
	//driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
	//driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
	//String expected=elib.getDataFromExcel("Sheet1", 0, 0);


	//FileInputStream fis1=new FileInputStream("./Data/contact.properties.xlsx");
	//Workbook wb=WorkbookFactory.create(fis1);
	//String lastname= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	//System.out.println(expected);
	//driver.findElement(By.xpath("//input[@class=\"detailedViewTextBox\"]")).sendKeys(lastname);
	//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	//driver.findElement(By.xpath("//a[@href=\"javascript:;\"]")).click();
	//driver.findElement(By.xpath("//a[@name=\"Campaigns\"]")).click();
	//driver.findElement(By.xpath("//td[@style=\"padding-right:0px;padding-left:10px;\"]")).click();
	//driver.findElement(By.xpath("//input[@class=\"detailedViewTextBox\"]")).sendKeys(lastname);
	//driver.findElement(By.xpath("//img[@alt=\"Select\"]")).click();

	//Set<String>mainwindow=driver.getWindowHandles();
	//Iterator<String>it=mainwindow.iterator();
	//while(it.hasNext())
	//{
	//String childwindow=it.next();
	//if(!mainwindow.equals(childwindow)) {
	//driver.switchTo().window(childwindow);
	//}
	//}
	//driver.findElement(By.id("search_txt")).sendKeys(lastname);
	//driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
	//driver.findElement(By.xpath("//a[@id=1]")).click();
	//

	//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	//String	actual=	driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();

	//if(actual.contains(lastname))
	//{
	//System.out.println("sucessfully created");	
	//}
	//else
	//{System.out.println("sucessfully not created");
	//}
	//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	//System.out.println("logout sucessfully");
	//}


	//}
