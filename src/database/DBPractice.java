package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBPractice {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.getConnection(url,un,pw)
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		/*
		 * insertsql
		 * query
		 * statement creation 
		 * execute
		 * close
		 */
		//to insert into table
		String sql="Insert into nameaddress(name,address) values('purnima','satungal')";
		Statement stm=con.createStatement();
		stm.execute(sql);
		
		
		//to read from table 
		String sql="Select * from nameaddress";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("address"));
		}
		
		//update
//		String sql="update nameaddress set address='kohalpur' where name='nishan'";
//		Statement st=con.createStatement();
//		st.execute(sql);
		
		
		
		//delete
//		String sql="delete from nameaddress where id=4";
//		Statement st=con.createStatement();
//		st.execute(sql);
	}
}
