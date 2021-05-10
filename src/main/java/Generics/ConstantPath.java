package Generics;

public interface ConstantPath {
String CurrentDirPath=System.getProperty("user.dir");
static String ExcelPath=CurrentDirPath+"/EXCEL/Data.xlsx";
static String PropPath=CurrentDirPath+"/EXCEL/CommonData.properties";
static String ListPath=CurrentDirPath+"/EXCEL";
static String ExtentRprt = CurrentDirPath+"/ScreenShots"; 


}
