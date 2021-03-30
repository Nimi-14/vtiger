package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Create1 {
public static void main(String[] args) throws SQLException {
	Driver dref=new Driver();
	DriverManager.registerDriver(dref);
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suhasini", "root", "root");
	Statement stat = conn.createStatement();
	String q = "Create database SDET";
	
	int result = stat.executeUpdate(q);
	
	if(result==0){
		System.err.println("project not created==FAIL");
	}else {
		System.out.println("project succuessFully cretaed==PASS");
	}
	
	   conn.close();
	}
}

