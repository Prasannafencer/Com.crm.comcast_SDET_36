package com.crm.comcast.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Login;

public class Baseclass  {
	public static WebDriver driver;
	File_utility flib=new File_utility();
	public Database_utility dlib=new Database_utility();
	public webdriver_utility wlib= new webdriver_utility();
	public Excel_utility elib=new Excel_utility();
	
	@BeforeSuite(groups = {"smoketesting"})
	public void TITLE_OF_THE_PAGE()
	{
		System.out.println("Start the suit execution");	
	}
	@BeforeClass(groups = {"smoketesting"})
	public void launch_the_browser() {
		driver=new ChromeDriver();	
	}
	@BeforeMethod(groups = {"smoketesting"})
	public void login() throws IOException
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
	public void logout() {
	webdriver_utility wlib= new webdriver_utility();
	Homepage hlib=new Homepage(driver);
	//
    wlib.mouseOverOnElement(driver, hlib.getlogoutbutton());
	wlib.ClickOnElement(driver, hlib.getsignout());
	System.out.println("logout sucesesfully");}
	//close the application	
	@AfterClass
	public void close()
	{
	driver.close();
	}
	//close the application
	@AfterSuite
	public void conactas()
	{
	System.out.println("contact close");	
	}

	
}
