package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.genericutility.File_utility;
import com.mysql.cj.jdbc.Driver;

public class Read_data_from_excel_file_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
Excel_utility elib=new Excel_utility();
		
String url=elib.getDataFromExcel("Shett1", 0, 0);
		String username=elib.getDataFromExcel("Shett1", 0, 1);
		String password=elib.getDataFromExcel("Shett1", 0, 2);
		
		//FileInputStream fis=new FileInputStream("./Data/Vtigerexcel.properties");
		//Workbook wb=WorkbookFactory.create(fis);
		//String url= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(url);
		//String username= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(username);
		//String password= wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(password);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		System.out.println("login sucesfully");
		driver.close();
		
		
	}

}
