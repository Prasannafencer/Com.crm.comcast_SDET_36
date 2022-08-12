package com.crm.comcast.genericutility;

	
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
	import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


	public class webdriver_utility {


		/**
			 *   it's an implicitly wait  Always wait for Element in DOM document & release the control if element available 
			 * @param driver
			 */
			public void waitForElementInDOM(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			/**
			 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
			 * @param driver
			 * @param partailPageURL
			 */
			public void waitForPage(WebDriver driver , String partailPageURL) {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.urlContains(partailPageURL));
			}
			
			/**
			 *   it's an Explicitly wait Always wait for Page to be loaded & available in GUI
			 * @param driver
			 * @param partailPageURL
			 */
			public void waitForElement (WebDriver driver , WebElement element) {
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			
			
			/**
			 *  used to Switch to child Window 
			 * @param driver
			 */
			public void swithTo_child_Window(WebDriver driver) {
				String mainWindowHandle = driver.getWindowHandle();
			    Set<String> allWindowHandles = driver.getWindowHandles();
			    Iterator<String> iterator = allWindowHandles.iterator();
				// Here we will check if child window has other child windows and will fetch the heading of the child window
			    while (iterator.hasNext()) {
			        String ChildWindow = iterator.next();
			            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
			            driver.switchTo().window(ChildWindow);}
			            else {
			            	driver.switchTo().window(mainWindowHandle);}}
							
						}
			/**
			 *  used to Switch to paraent Window 
			 * @param driver
			 */
			public void swithTo_parent_Window(WebDriver driver)
			{String mainid=driver.getWindowHandle();
			driver.switchTo().window(mainid);}
			
							/**
			 * used to Switch to Alert Window & click on OK button
			 * @param driver
			 */
			public void swithToAlertWindowAndAccpect(WebDriver driver ,String expectedMsg) {
				Alert alt = driver.switchTo().alert();
				 if(alt.getText().equals(expectedMsg)) {
					 System.out.println("Alert Message is verified");
				 }else {
					 System.out.println("Alert Message is not verified");
				 }
				alt.accept();
			}
			/**
			 * used to Switch to Alert Window & click on OK button
			 * @param driver
			 */
			public void openbrowser(String url) {
				WebDriver driver = new ChromeDriver();
				 driver.get(url);
			}
			
			/**
			 * used to Switch to Alert Window & click on Cancel button
			 * @param driver
			 */
			public void swithToAlertWindowAndCancel(WebDriver driver, String expectedMsg) {
				Alert alt = driver.switchTo().alert();
				 if(alt.getText().equals(expectedMsg)) {
					 System.out.println("Alert Message is verified");
				 }else {
					 System.out.println("Alert Message is not verified");
				 }
				 alt.dismiss();
			}
			/**
			 * used to Switch to Frame Window based on index
			 * @param driver
			 * @param index
			 */
			public void swithToFrame(WebDriver driver , int index) {
				driver.switchTo().frame(index);
			}
			
			/**
			 * used to Switch to Frame Window based on id or name attribute
			 * @param driver
			 * @param id_name_attribute
			 */
			public void swithToFrame(WebDriver driver , String id_name_attribute) {
				driver.switchTo().frame(id_name_attribute);
			}
			
			/**
			 * used to select the value from the dropDwon  based on index
			 * @param driver
			 * @param index
			 */
			public void select(WebElement element , int index) {
				Select sel = new Select(element);
				sel.selectByIndex(index);
			}
			/**
			 * used to select the value from the dropDwon  based on value / option avlaible in GUI
			 * @param element
			 * @param value
			 */
			public void select(WebElement element , String text) {
				Select sel = new Select(element);
				sel.selectByVisibleText(text);
			}
			/**
			 * used to place mouse cursor on specified element
			 * @param driver
			 * @param elemnet
			 */
			public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
			{
				Actions act = new Actions(driver);
				act.moveToElement(elemnet).perform();
			}
			
			/**
			 * 	 used to right click  on specified element

			 * @param driver
			 * @param elemnet
			 */
			
			public void rightClickOnElement(WebDriver driver , WebElement elemnet)
			{
				Actions act = new Actions(driver);
				act.contextClick(elemnet).perform();
			}
			/**
			 * used to click on specified element
			 * @param driver
			 * 
			 */
			public void ClickOnElement(WebDriver driver , WebElement elemnet)
			{
				Actions act = new Actions(driver);
				act.click(elemnet).perform();
			}
			
			/**
			 * 
			 * @param driver
			 * @param javaScript
			 */
			public void executeJavaScript(WebDriver driver , String javaScript) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeAsyncScript(javaScript, driver);
			}
			
			   public void waitAndClick(WebElement element) throws InterruptedException
			   {
				   int count = 0;
			       while(count<20) {
				    	   try {
				    	       element.click();
				    	       break;
				    	   }catch(Throwable e){
				    		   Thread.sleep(1000);
				    		   count++;
				    	   }
			       }
			   }
			   

			   /**
			     * iterator method
			     * @param driver
			     */
			   public void windowhandle(WebDriver driver) {
				   String mainid=driver.getWindowHandle();
					Set<String>mainwindow=driver.getWindowHandles();
					Iterator<String>it=mainwindow.iterator();
					while(it.hasNext())
					{
						String childwindow=it.next();
						if(!mainwindow.equals(childwindow)) {
							driver.switchTo().window(childwindow);
						}
					}			   } 
			    
			    /**
			     * pass enter Key appertain in to Browser
			     * @param driver
			     * @throws AWTException 
			      
			     */
			  
				public void Robotpass_EnterKey() throws AWTException {
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_ENTER);					
				}

				
					
				} 




		


