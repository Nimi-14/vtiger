package Sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exxl {
	public String getData(String sheet,int row,int col) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis=new FileInputStream("./EXCEL/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet(sheet);
		Row r = sht.getRow(row);
		wb.close();
		return r.getCell(col).getStringCellValue();
	  }  
		
	public void setData1(String sheet, int row1,int colm,String Data) throws IOException{
		FileInputStream fis1=new FileInputStream("./EXCEL/TRip.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh = wb1.getSheet(sheet);
		Row r1 = sh.getRow(row1);
		Cell c1 = r1.createCell(colm);
		c1.setCellValue(Data);
		FileOutputStream fout=new FileOutputStream("./EXCEL/TRip.xlsx");
		wb1.write(fout);
		wb1.close();
	}
	
public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./EXCEL/Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet(sheetname);
   return sh.getLastRowNum();
}

}
