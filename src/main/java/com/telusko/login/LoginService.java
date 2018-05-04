package com.telusko.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {
  public boolean Check(String uname,String pword) {
	 
	  
	String url = "jdbc:mysql://localhost:3306/mydb";
	String u  = "root";
	String p = "root";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		PreparedStatement ps = con.prepareStatement(" select * from login where uname=? and pword=?");
		ps.setString(1, uname);
		ps.setString(2, pword);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	  return false;
  }
}
