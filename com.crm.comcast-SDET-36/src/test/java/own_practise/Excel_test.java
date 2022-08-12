package own_practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis1=new FileInputStream("./Data/contact.properties.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
			String name= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		String email= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(email);

		
	}

}
