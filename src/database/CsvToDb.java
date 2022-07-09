package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CsvToDb {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//1.register driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2.getConnection(url,un,pw)
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
				FileReader file=new FileReader("d://3pm/testcsv.csv");
				BufferedReader buffer =new BufferedReader(file);//cache maa file ko data liera raakhxa tesaile fast
				String sql="insert into csv_data(stdid,companyname,employeemarkme,std_description,lv)values(?,?,?,?,?)";
				PreparedStatement stm=null;
				buffer.readLine();
				String line;// = buffer.readLine();
				while ((line=buffer.readLine())!=null) {
					stm=con.prepareStatement(sql);
					String[]	data =line.split(",");
						
//					for(int i=0;i<5;i++) {
//						System.out.println(data[i]);
//						
//					}
				//	String sql="insert into csv( sn , companyname , emloyeemarkme , description , leave )values('"+Data[0]+"','"+Data[1]+"','"+Data[2]+"','"+Data[3]+"','"+Data[4]+"')";
					 stm.setString(1, data[0]);
					 stm.setString(2, data[1]);
					 stm.setString(3, data[2]);
					 stm.setString(4, data[3]);
					 stm.setString(5, data[4]);
					 
					 System.out.println(sql);
					 
					 stm.execute();
					
				}
	}

}
