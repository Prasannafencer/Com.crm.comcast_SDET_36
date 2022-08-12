package com_crm.Email_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.crm.comcast.genericutility.webdriver_utility;

public class Email_contact_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		File_utility flib=new File_utility();
		Excel_utility elib=new Excel_utility();
		webdriver_utility wlib=new webdriver_utility();
		String url=flib.getPropertyKeyValue("url");
		String user=flib.getPropertyKeyValue("username");
		
		String pwd=flib.getPropertyKeyValue("password");
		//flib.getPropertyKeyValue("username");
		
		//FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
		//Properties p=new Properties();
		//p.load(fis);
		//String url=p.getProperty("url");
		//String user=p.getProperty("username");
		//String pwd=p.getProperty("password");
		wlib.openbrowser(url);
		WebDriver driver=new ChromeDriver();

				driver.get(url);
				driver.findElement(By.name("user_name")).sendKeys(user);
				driver.findElement(By.name("user_password")).sendKeys(pwd);
				driver.findElement(By.id("submitButton")).click();

		System.out.println("login sucesfully");

		
		
	
 
driver.findElement(By.xpath(" //a[contains(text(),'Contacts')]")).click();
driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
String name=elib.getDataFromExcel("Sheet1", 0, 0);
//FileInputStream fis1=new FileInputStream("./Data/contact.properties.xlsx");
//Workbook wb=WorkbookFactory.create(fis1);
	//String name= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(name);
String email=elib.getDataFromExcel("Sheet1", 0, 1);
System.out.println(email);
driver.findElement(By.name("lastname")).sendKeys(name);
driver.findElement(By.xpath("//input[@id=\"email\"][@class=\"detailedViewTextBox\"]")).sendKeys(email);
driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
System.out.println("done");
String actual=driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
System.out.println(actual);



	if(actual.contains(name))
	{
		System.out.println("contact creation sucssefully");
	}
	else
	{
		System.out.println("contact creation not-sucssefully");
	}
	
driver.findElement(By.xpath("//a[@href=\"index.php?module=Emails&action=index\"]")).click();
driver.findElement(By.xpath("//td[@nowrap=\"\"][@style=\"padding-left:20px;padding-right:20px\"]")).click();
String mainid=driver.getWindowHandle();
Set<String>mainwindow=driver.getWindowHandles();
Iterator<String>it=mainwindow.iterator();
while(it.hasNext())
{
	String childwindow=it.next();
	if(!mainwindow.equals(childwindow)) {
		driver.switchTo().window(childwindow);

	}
}WebElement list=driver.findElement(By.xpath("//Select[@name=\"parent_type\"]"));
Select search=new Select(list);
search.selectByVisibleText("Contacts");
driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();

//wlib.windowhandle(driver);

Set<String>mainwindow1=driver.getWindowHandles();
Iterator<String>it1=mainwindow1.iterator();
while(it1.hasNext())
{
	String childwindow1=it1.next();
	if(!mainwindow1.equals(childwindow1)) {
		driver.switchTo().window(childwindow1);
	}
driver.close();
}

driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(name);
driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
driver.findElement(By.xpath("//a[@id='1']")).click();
driver.switchTo().window(mainid);
driver.findElement(By.xpath("//input[@name=\"subject\"]")).sendKeys("save");



















}}