package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Fetch2 {
public static void main(String[] args) throws SQLException {
	
	Driver dref=new Driver();
	DriverManager.registerDriver(dref);
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suhasini", "root", "root");
	
	Statement stat = conn.createStatement();
	String q = "Select * from information";
	
	ResultSet result = stat.executeQuery(q);
	while(result.next()){
		System.out.println(result.getString(1)+ "\t" + result.getString(2)+ "\t" + result.getString(3) );
	}
	
	conn.close();
	System.out.println("Connection closed");
  }

}
