package Sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {
public static void main(String[] args) throws Throwable {
	    
		FileInputStream fis=new FileInputStream("./EXCEL/TRip.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	    Row ro = sh.getRow(0);
	    Cell cel = ro.getCell(0);
	    String value = cel.getStringCellValue();
	    System.out.println(value);
	
	    
}
}
