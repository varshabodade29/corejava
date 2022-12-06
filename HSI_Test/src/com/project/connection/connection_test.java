package com.project.connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class connection_test {
	public static void main(String[]args) {
		String url="jdbc:mysql://localhost:3306/movie";
		String username="root";
		String pw="piyush27";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, username, pw);
			System.out.println("connection established sucessfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
