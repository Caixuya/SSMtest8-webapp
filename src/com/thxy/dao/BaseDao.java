package com.thxy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BaseDao {
	
	public static Connection getConnection(){
		String url="jdbc:mysql://localhost:3306/test8?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
		String user="tia";
		String password="980703";
		 //2.连接到具体的数据库
		Connection conn = null;
		try {
			//Driver driver = new com.mysql.jdbc.Driver();
			
			//通过得到字节码对象的方式加载静态代码块，从而注册驱动程序
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 //Driver driver2 = new com.oracle.jdbc.Driver();
			 //1.注册驱动程序(可以注册多个驱动程序)
			 //DriverManager.registerDriver(driver);
			 //DriverManager.registerDriver(driver2);
			
			 conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conn;
		
	}
}
