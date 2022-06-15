package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogInPage {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-b0b06br/login.do");
		Thread.sleep(4000);
		
		FileInputStream file = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String usrename = cell.getStringCellValue();
		
		FileInputStream file1 = new FileInputStream("./data/ActiTimeLoginTestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(file1);
		Sheet sh1 = wb1.getSheet("Sheet1");
		Row row1 = sh1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String password= cell1.getStringCellValue();
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(usrename);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
