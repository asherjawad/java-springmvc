package com.telusko.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoginService {
  public boolean Check() {
	 
	String url = "";
	String u  = "";
	String p = "";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u,p);
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
	  return false;
  }
}
