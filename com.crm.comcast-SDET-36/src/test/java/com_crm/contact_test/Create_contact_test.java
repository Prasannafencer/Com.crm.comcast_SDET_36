package com_crm.contact_test;
import java.io.FileInputStream;
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
public class Create_contact_test {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		File_utility flib=new File_utility();
		Database_utility dlib=new Database_utility();
		Excel_utility elib=new Excel_utility();
		webdriver_utility wlib= new webdriver_utility();
		Login llib=new Login(driver);
		Homepage hlib=new Homepage(driver);
		Contact_page Clib=new Contact_page(driver);
		
		String url=flib.getPropertyKeyValue("url");
		String user=flib.getPropertyKeyValue("username");
		String pwd=flib.getPropertyKeyValue("password");
		
		driver.get(url);
		
		llib.logintoapp(user, pwd);
		String lastname=elib.getDataFromExcel("Sheet1", 0, 0);
		System.out.println("login sucesfully");
		
		hlib.clickcontact(driver);
		Clib.clickcreate_contact(driver);
		Clib.enter_lastname(elib.getDataFromExcel("Sheet1", 0, 0));
		Clib.save_contact(driver);	
		
		String name=lastname;
		if( Clib.contact_information_text().contains(name)) {
			System.out.println("contact save sucesfully");
		}
		else
		{
			System.out.println("contact save not sucesfully");}
		
		wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
		wlib.ClickOnElement(driver, hlib.getsignout());
		System.out.println("logout sucesesfully");
		driver.close();
	}

}

//FileInputStream fis=new FileInputStream("./Data/Vtiger.properties");
//Properties p=new Properties();
//p.load(fis);//
//String url=p.getProperty("url");
//String user=p.getProperty("username");
//String pwd=p.getProperty("password");
//wlib.openbrowser("");
//WebDriver driver=new ChromeDriver();
//driver.findElement(By.name("user_name")).sendKeys(user);
//driver.findElement(By.name("user_password")).sendKeys(pwd);
//driver.findElement(By.id("submitButton")).click();
//driver.findElement(By.xpath(" //a[contains(text(),'Contacts')]")).click();
//driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();


//FileInputStream fis1=new FileInputStream("./Data/contact.properties.xlsx");

//Workbook wb=WorkbookFactory.create(fis1);
//String expected= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//driver.findElement(By.name("lastname")).sendKeys(expected);
//driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
//String actual=driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
/*System.out.println(actual);
	if(actual.contains(expected))
			{
				System.out.println("contact creation sucssefully");
			}
			else
			{
				System.out.println("contact creation not-sucssefully");
			}
			driver.close();
			}

		}*/

