package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testdatadriven {
 
	
	@Test
public void data() throws FileNotFoundException {
	
	File excel=new File("D:\\Assessment\\datadriven.xlsx");//location of my excel
	
	System.out.println(excel.exists());
	
	FileInputStream input=new FileInputStream(excel);
	
	try {
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//access the row---count
		//col----count
		
		
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<row_count;i++) {
		
			XSSFRow row=sheet.getRow(i);
		for(int j=0;j<col_count;j++) {
		
			System.out.println(row.getCell(j).getStringCellValue());
			
			
		}
		
		}
		
		
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
}
