package com.crm.comcast.pomrepositylib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
public Login(WebDriver driver)
{ 
	PageFactory.initElements(driver, this);
	}
@FindBy(name="user_name")
private WebElement username;
@FindBy(name="user_password")
private WebElement password;
@FindBy(id="submitButton")
private WebElement submit;
public WebElement getusername()
{
return username;	
}
public WebElement getpassword()
{
return password;	
}
public WebElement getsubmit()
{
return submit;	
}
public void logintoapp(String username,String password)

{
	
getusername().sendKeys(username);
getpassword().sendKeys(password);
getsubmit().click();
}}


