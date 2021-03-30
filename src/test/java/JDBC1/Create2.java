package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Create2 {
public static void main(String[] args) throws SQLException {
	
	Connection conn = null;
	int result=0;
	
	try{Driver dref=new Driver();
	DriverManager.registerDriver(dref);

	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suhasini", "root", "root");
	
	Statement stat = conn.createStatement();
	String q = "insert into information values('Kim Nam Joon','1998-09-08','098')";
	
	result = stat.executeUpdate(q);
	}
	catch (Exception e){
		
	}
	
	finally{
		if(result==0) {
		System.err.println("project not created==FAIL");
	}else {
		System.out.println("project succuessFully cretaed==PASS");
	}
		conn.close();
  }
}
}
