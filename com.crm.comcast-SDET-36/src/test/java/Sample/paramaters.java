package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;

public class paramaters extends Baseclass
{
@Test
@Parameters("name")
public void primename(String name)
{
WebDriver driver=new ChromeDriver();
driver.get("http://localhost:8888/");
	
}}

