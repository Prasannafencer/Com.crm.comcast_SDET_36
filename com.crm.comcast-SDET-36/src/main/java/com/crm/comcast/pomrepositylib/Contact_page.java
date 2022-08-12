package com.crm.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_page {

public Contact_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="lastname")
	private WebElement lastname;
	public WebElement getlastname()
	{
		return lastname;
	}
	public void enter_lastname(String lastname)
	{
		getlastname().sendKeys(lastname);
	}
	//using click button
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement save;
	public WebElement getsave()
	{
		return save;
	}
	public void save_contact(WebDriver driver)
	{
		getsave().click();
	}
//get after sucesesfull save contact information text
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement contact_information_text;
	public WebElement getcontact_information_text()
	{
		return contact_information_text;
	}
public String contact_information_text()
{
String text=getcontact_information_text().getText();
return text;
}
@FindBy(xpath="//span[@class=\"genHeaderSmall\"]")
private WebElement delete_information_text;
public WebElement getdelete_information_text()
{
return delete_information_text;
}
public String delete_information_text() 
{
String text=getdelete_information_text().getText();	
return text;
}
@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
private WebElement create_contact;
public WebElement getcreate_contact() {
return create_contact;
}
public void clickcreate_contact(WebDriver driver) {
	getcreate_contact().click();
}
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
private WebElement title;
public WebElement gettitle()
{
	return title;
}
@FindBy(xpath="//input[@title=\"Delete [Alt+D]\"]")
private WebElement Delete;
public WebElement getDelete()
{
	return Delete;
}
public void Delete_contact(WebDriver driver)
{
	getDelete().click();
}
@FindBy(xpath="//input[@name=\"search_text\"]")
private WebElement Searchfor;
public WebElement getSearchfor()
{
	return Searchfor;
	}
public void Searchfor(String lastname) 
{
getSearchfor().sendKeys(lastname);	
	}
@FindBy(xpath="//input[@name=\"search_text\"]")
private WebElement Searchnow;
public WebElement getSearchnow()
{
return Searchnow;	
}
public void Searchnow(WebDriver driver)
{
getSearchnow().click();	
}
@FindBy(name="selectall")
private WebElement selectall;
public WebElement getselectall()
{
	return selectall;}
	
public void selectall(WebDriver driver)
{
	getselectall().click();
}
@FindBy(xpath="//input[@value=\"Delete\"]")
private WebElement delete;
public WebElement getdelete()
{
return delete;
}
public void delete(WebDriver driver)
{
getdelete().click();	
}
@FindBy(xpath="//select[@id=\"bas_searchfield\"]")
private WebElement Searchfield;
public WebElement getSearchfield()
{
	return Searchfield;
	}
public void Searchfield()
{
getSearchfield();
}


}

