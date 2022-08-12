package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.comcast.genericutility.Excel_utility;

public class Add_value_into_excel_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Excel_utility elib=new Excel_utility();
		String before=elib.getDataFromExcel("Sheet1", 0, 0);
//FileInputStream fis = new FileInputStream("Data/student_data_excel.properties.xlsx");
//Workbook wb=WorkbookFactory.create(fis);
//String before=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

//wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("abc");
System.out.println(before);

	}

}
