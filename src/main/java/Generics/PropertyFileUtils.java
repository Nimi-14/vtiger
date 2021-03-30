package Generics;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtils {
public String propFileUtils(String key) throws Throwable{
	FileInputStream fis=new FileInputStream(ConstantPath.PropPath);
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
}
}
