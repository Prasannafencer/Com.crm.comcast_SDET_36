package com.crm.comcast.pomrepositylib;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[@href=\"index.php?module=Calendar&action=index\"]")
private WebElement calender;
public WebElement getcalender()
{
return calender;	
}
@FindBy(xpath="//a[@href=\"index.php?module=Leads&action=index\"]")
private WebElement leads;
public WebElement getleads()
{
return leads;	
}
@FindBy(xpath="//a[@href=\"index.php?module=Accounts&action=index\"]")
private WebElement Organizations;
public WebElement getOrganizations()
{
return Organizations;	
}
public void Click_on_Organizations(WebDriver driver)
{
getOrganizations().click();	
}
@FindBy(xpath="//a[@href=\"index.php?module=Contacts&action=index\"]")
private WebElement contact;
public WebElement getcontact()
{
return contact;	
}
@FindBy(xpath="//a[@href=\"index.php?module=Potentials&action=index\"]")
private WebElement Opportunities;
public WebElement getOpportunities()
{
return Opportunities;	
}
@FindBy(xpath="//a[@href=\"index.php?module=Products&action=index\"]")
private WebElement Products;
public WebElement getProducts()
{
return Products;	
}
public void click_product(WebDriver driver)
{
getProducts().click();	
	}
@FindBy(xpath="//a[@href=\"index.php?module=Documents&action=index\"]")
private WebElement Documents;
public WebElement getDocuments()
{
return Documents;	
}
@FindBy(xpath="//a[contains(text(),'Email')]")
private WebElement Email;
public WebElement getEmail()
{
return Email;	
}
@FindBy(xpath="//a[contains(text(),'Trouble Tickets')]")
private WebElement TroubleTickets;
public WebElement getTroubleTickets()
{
return TroubleTickets;	
}
@FindBy(xpath="//a[contains(text(),'Dashboard')]")
private WebElement Dashboard;
public WebElement getDashboard()
{
return Dashboard;	
}
@FindBy(xpath="//a[@href=\"javascript:;\"]")
private WebElement More;
public WebElement getMore()
{
return More;	
}
@FindBy(name="SMSNotifier")
private WebElement SMSNotifier;
public WebElement getSMSNotifier()
{
return SMSNotifier;	
}
@FindBy(name="Our Sites")
private WebElement Our_Sites;
public WebElement getOur_Sites()
{
return Our_Sites;	
}
@FindBy(name="Integration")
private WebElement Integration;
public WebElement getIntegration()
{
return Integration;	
}
@FindBy(name="Mail Manager")
private WebElement Mail_Manager;
public WebElement getMail_Manager()
{
return Mail_Manager;	
}
@FindBy(name="PBX Manager")
private WebElement PBX_Manager;
public WebElement getPBX_Manager()
{
return PBX_Manager;		
}
@FindBy(name="Comments")
private WebElement Comments;
public WebElement getComments()
{
return Comments;	
}
@FindBy(name="Recycle Bin")
private WebElement Recycle_Bin;
public WebElement getRecycle_Bin()
{
return Recycle_Bin;	
}@FindBy(name="RSS")
private WebElement RSS;
public WebElement getRSS()
{
return RSS;	
}
@FindBy(name="Reports")
private WebElement Reports;
public WebElement getReports()
{
return Reports;	
}
@FindBy(name="Campaigns")
private WebElement Campaigns;
public WebElement getCampaigns()
{
return Campaigns;	
}
@FindBy(name="Service Contracts")
private WebElement Service_Contracts;
public WebElement getService_Contracts()
{
return Service_Contracts;	
}
@FindBy(name="Project Milestones")
private WebElement Project_Milestones;
public WebElement getProject_Milestones()
{
return Project_Milestones;	
}
@FindBy(name="Project Tasks")
private WebElement Project_Tasks;
public WebElement getProject_Tasks()
{
return Project_Tasks;	
}
@FindBy(name="Projects")
private WebElement Projects;
public WebElement getProjects()
{
return Projects;	
}
@FindBy(name="FAQ")
private WebElement FAQ;
public WebElement getFAQ()
{
return FAQ;	
}
@FindBy(name="Services")
private WebElement Services;
public WebElement getServices()
{
return Services;	
}
@FindBy(name="Assets")
private WebElement Assets;
public WebElement getAssets()
{
return Assets;	
}
@FindBy(name="Purchase Order")
private WebElement Purchase_Order;
public WebElement getPurchase_Order()
{
return Purchase_Order;	
}@FindBy(name="Price Books")
private WebElement Price_Books;
public WebElement getPrice_Books()
{
return Price_Books;	
}
@FindBy(name="Vendors")
private WebElement Vendors;
public WebElement getVendors()
{
return Vendors;	
}@FindBy(name="Invoice")
private WebElement Invoice;
public WebElement getInvoice()
{
return Invoice;	
}
@FindBy(name="Sales Order")
private WebElement Sales_Order;
public WebElement getSales_Order()
{
return Sales_Order;	
}@FindBy(name="Quotes")
private WebElement Quotes;
public WebElement getQuotes()
{
return Quotes;	
}@FindBy(xpath="//select[@id=\"qccombo\"]")
private WebElement QCreatelistbox;
public WebElement getQCreatelistbox()
{
return QCreatelistbox;	
}
public void clickcontact(WebDriver driver)
{
getcontact().click();	}
public void clickcalender(WebDriver driver)
{
	getcalender();}

public void clickleads(WebDriver driver)
{
	getleads();}
public void clickorganization(WebDriver driver)
{
	getOrganizations();}
public void clickOpportunities(WebDriver driver)
{
	getOpportunities();}

public void clickProducts(WebDriver driver)
{
	getProducts();}
public void clickDocuments(WebDriver driver)
{
	getDocuments();}
public void clickEmail(WebDriver driver)
{
	getEmail();}

@FindBy(xpath="//img[@style=\"padding: 0px;padding-left:5px\"]")
private WebElement logoutbutton;
public WebElement getlogoutbutton()
{
return logoutbutton;	
}
@FindBy(xpath="//a[@href=\"index.php?module=Users&action=Logout\"]")
private WebElement signout;
public WebElement getsignout()
{
return signout;	
}







}







	