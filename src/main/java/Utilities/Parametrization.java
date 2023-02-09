package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	
	public static String PhaseExcelData (String fileName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		
		
//		SecurityManager securityManager = new SecurityManager();//if "Security Manager" is there 
//		securityManager.checkRead(fileName);                    //call its "checkRead" method accepts "name" in it's argument
		
	FileInputStream File = new FileInputStream ("D:\\100.automation\\my.mavan.1\\src\\test\\resources\\DataForSelenium.xlsx");
	String data =WorkbookFactory.create(File).getSheet(fileName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	return data;
}
}
