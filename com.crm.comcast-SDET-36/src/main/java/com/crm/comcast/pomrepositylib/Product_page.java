package com.crm.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {
		public Product_page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}

@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
private WebElement create_product;
public WebElement getcreate_product()
{
return create_product;	
}
public void click_on_create_product(WebDriver driver)
{
	getcreate_product().click();
}
@FindBy(xpath="//input[@class=\"detailedViewTextBox\"]")
private WebElement lastname_textbox;
public WebElement getlastname_textbox()
{
return lastname_textbox;
	}
public void lastname_textbox(String lastname)
{
	getlastname_textbox().sendKeys(lastname);
}
@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
private WebElement savebutton;
public WebElement getsavebutton()
{
return savebutton;	
}
public void savebutton(WebDriver driver)
{
getsavebutton().click();	
}
@FindBy(xpath="//a[contains(text(),'More')]")
private WebElement morebutton;
public WebElement getmorebutton()
{
return morebutton;	
}

@FindBy(xpath="//a[@name=\"Campaigns\"]")
private WebElement capaignsbutton;
public WebElement getcapaignsbutton()
{
return capaignsbutton;	
}
public void capaignsbutton(WebDriver driver)
{
getcapaignsbutton().click();	
}
}
