package Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
public String getSheetData() throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream(ConstantPath.ExcelPath);

	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
    Row row = sh.getRow(0);
    wb.close();
    return row.getCell(0).getStringCellValue();
}
}

