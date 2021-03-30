package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Fetch1{
	public static void main(String[] args) throws Throwable{
		Connection conn=null;
	try{	
		Driver dref= new Driver();
		DriverManager.registerDriver(dref);
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suhasini", "root", "root");
		System.out.println("Connected");
		
		Statement stat = conn.createStatement();
		String q = "Select * from information";
		
		ResultSet result = stat.executeQuery(q);
		while(result.next()){
			System.out.println(result.getString(1)+ "\t" + result.getString(2)+ "\t" + result.getString(3));
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	finally{
		conn.close();
		System.err.print("Close Connection");
		
	    }
	}
}
	