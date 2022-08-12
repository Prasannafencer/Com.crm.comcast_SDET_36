package practise;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast.genericutility.Excel_utility;

public class Find_the_data_from_excelfile_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Excel_utility elib= new Excel_utility();
		int lastrow=elib.getlastrow("Sheet1");
		//DataFormatter format=elib.getDataFromExcel("Sheet1", 0, 0);
		//FileInputStream fis=new FileInputStream("Data/student_data_excel.properties.xlsx");
		//Workbook wb=WorkbookFactory.create(fis);
		//Sheet sh=wb.getSheet("shee1");
		//DataFormatter format=new DataFormatter();
		//int lastrow=wb.getSheet("Sheet1").getLastRowNum();
		//System.out.println("lastRow=" +lastrow);
		for(int i=0;i<lastrow;i++)
		{
			String id=elib.getDataFromExcel("Sheet1", i, 0);
		//String id= wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			//String id1=elib.getDataFromExcel("Sheet1", i, 1);
			//String id1= wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
		System.out.println(id+ "\t" );
		
	
	
		
		}
		
	}

}
