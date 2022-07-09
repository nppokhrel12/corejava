package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. register driver
		Class.forName("com.mysql.cj.jdbc.Driver");//mysql ko thau maa oracle in case of oracle 
		//2. getConnection (url,username,password)
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");	
		/*
		 * insert SQL 
		 * query 
		 * st create
		 * execute 
		 * close
		 */
//		String sql="Insert into user(fname,lname,username,password)values('gsdfg','sgingh','ra','1234')";
//		Statement stm=con.createStatement();
//		stm.execute(sql);
//		System.out.println("added");
		
		//select query
		String sql="Select * from user ";
		Statement stm=con.createStatement();
		
		ResultSet rs= stm.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Id "+rs.getInt("id"));
			System.out.println("Id "+rs.getString("fname"));
		}
		
		//update sql
//		String sql="update user set password='ram' where fname='ram'";
//		Statement stm=con.createStatement();
//		
//		stm.execute(sql);
//		System.out.println("sucess");
		
		//delete
//		String sql="delete user where fname = 'ram'";
//		Statement stm=con.createStatement();
//		
//		stm.execute(sql);
//		System.out.println("sucess");
		
		
		
		
	}
}