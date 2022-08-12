package com.crm.organization.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;
import com.crm.comcast.pomrepositylib.Organization_page;
import com.crm.comcast.pomrepositylib.Product_page;

public class Create_organization_test {

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
		Homepage hlib=new Homepage(driver);
		String url	=flib.getPropertyKeyValue("url");
		String user	=flib.getPropertyKeyValue("username");
		String pwd=flib.getPropertyKeyValue("password");
		driver.get(url);
		Login llib=new Login(driver);
		llib.logintoapp(user, pwd);
		System.out.println("login sucesfully");
			String expected=elib.getDataFromExcel("Sheet1", 0, 0);
		
		//FileInputStream fis1=new FileInputStream("./Data/contact.properties.xlsx");
		//Workbook wb=WorkbookFactory.create(fis1);
		//String expected= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(expected);
hlib.Click_on_Organizations(driver);
Organization_page olib=new Organization_page(driver);
olib.create_Organization(driver);
olib.Organization_Name("expected2");
olib.save_button(driver);
String text=olib.getOrganization_info().getText();
System.out.println(olib.getOrganization_info());
		//driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		//driver.findElement(By.xpath("//input[@class=\"detailedViewTextBox\"]")).sendKeys(expected);
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//String actual=driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
				
				//System.out.println(actual);

				if(text.contains("expected2"))
				{
					System.out.println("Organization creation not-sucssefully");
				}
				else
				{
					System.out.println("Organization creation not-sucssefully");
				}
				wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
				wlib.ClickOnElement(driver, hlib.getsignout());
				System.out.println("logout sucesesfully");
				
				driver.close();
				}


				
		


	}


