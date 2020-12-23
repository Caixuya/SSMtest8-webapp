package com.thxy.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.thxy.dao.BaseDao;
import com.thxy.dao.UserDao;
import com.thxy.pojo.User;

@Service("userDao")
public class UserDaoImpl implements UserDao {

	Connection conn=null;
	
	public void addUser(User user) throws SQLException {
		conn=BaseDao.getConnection();
		
		String sql="insert into user(username,password) value('"+user.getUsername()+",'"+user.getPassword()+"')";
		System.out.println(sql);
		
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		
		statement.close();
		conn.close();
	}
	
}
