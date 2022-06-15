package dataDrivenFrameWork;

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

public class flib {

	
	public String readData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
	}
		
		public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
		}
		
		public String writeExcelData(String excelPath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowcount);
			
			Cell cell = row.createCell(cellcount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
			return data;
		}
		
		
		
		
	}

