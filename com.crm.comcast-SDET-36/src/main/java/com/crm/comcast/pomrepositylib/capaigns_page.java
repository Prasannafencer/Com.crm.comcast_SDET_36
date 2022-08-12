package com.crm.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class capaigns_page {
public capaigns_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@title=\"Create Campaign...\"]")
private WebElement craetecapaigns;
public WebElement getcraetecapaigns()
{
return craetecapaigns;	
}
public void craetecapaigns(WebDriver driver)
{
getcraetecapaigns().click();	
}
@FindBy(xpath="//input[@class=\"detailedViewTextBox\"]")
private WebElement lastnametextbox;
public WebElement getlastnametextbox()
{
return lastnametextbox;	
}
public void lastnametextbox(String lastname)
{
getlastnametextbox().sendKeys(lastname);	
	}
@FindBy(xpath="//img[@alt=\"Select\"]")
private WebElement Addproduct_textbox;
public WebElement getAddproduct_textbox()
{
return Addproduct_textbox;
}
public void Addproduct_textbox(WebDriver driver)
{
getAddproduct_textbox().click();	
}
@FindBy(id="search_txt")
private WebElement childwindow_searchTtxtbox;
public WebElement getchildwindow_searchTtxtbox()
{
return childwindow_searchTtxtbox;	
}
public void childwindow_searchTtxtbox(String Lastname)
{
getchildwindow_searchTtxtbox().sendKeys(Lastname);	
}
@FindBy(xpath="//input[@name=\"search\"]")
private WebElement childwindow_searchbutton;
public WebElement getchildwindow_searchbutton()
{
return childwindow_searchbutton;	
}
public void childwindow_searchbutton(WebDriver driver)
{
getchildwindow_searchbutton().click();;	
}
@FindBy(id="1")
private WebElement select_product_name;
public WebElement getselect_product_name()
{
return select_product_name;	
}
public void select_product_name(WebDriver driver)
{
getselect_product_name().click();;	
}
@FindBy(xpath="//input[@class=\"detailedViewTextBox\"]")
private WebElement capaigns_name_textbox;
public WebElement getcapaigns_name_textbox()
{
return capaigns_name_textbox;	
}
public void capaigns_name_textbox(String capaigns_name)
{
getcapaigns_name_textbox().sendKeys(capaigns_name);	
}
@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
private WebElement campaigns_save_button;
public WebElement getcampaigns_save_button()
{
return campaigns_save_button;	
}
public void campaigns_save_button(WebDriver driver)
{
getcampaigns_save_button().click();;	
}
@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
private WebElement capaigns_text_info;
public WebElement getcapaigns_text_info()
{
return capaigns_text_info;	
}
public String capaigns_text_info()
{
String text=getcapaigns_text_info().getText();	
return text;
}
}




