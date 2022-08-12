package com.crm.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_page
{
	public Organization_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//a[@href=\"index.php?module=Accounts&action=index\"]")
	private WebElement lastname_textbox;
	public WebElement getlastname_textbox()
	{
	return lastname_textbox;
		}
	public void lastname_textbox(String lastname)
	{
		getlastname_textbox().sendKeys(lastname);
	}
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement create_Organization;
	public WebElement getcreate_Organization()
	{
	return create_Organization;
		}
	public void create_Organization(WebDriver driver)
	{
		getcreate_Organization().click();
	}
	@FindBy(xpath="//input[@class=\"detailedViewTextBox\"]")
	private WebElement Organization_Name	
;
	public WebElement getOrganization_Name()
	{
	return Organization_Name	
;
		}
	public void Organization_Name(String lastname)
	{
		getOrganization_Name().sendKeys(lastname);
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save_button;	

	public WebElement getsave_button()
	{
	return save_button;	
		}
	public void save_button(WebDriver driver)
	{
		getsave_button().click();
	}

	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement Organization_info;	

	public WebElement getOrganization_info()
	{
	return Organization_info;	
		}
	public String Organization_info()
	{
		String text=getOrganization_info().getText();
	return text;
	}
	
}
