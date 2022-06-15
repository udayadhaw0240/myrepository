package ReadAndWriteExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fie = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fie);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		
	    Cell cell = row.createCell(2);
	    cell.setCellValue("Status");
	    
	    FileOutputStream fos = new FileOutputStream("./data/ActiTimeLoginTestData.xlsx");
		wb.write(fos);
	}

}
