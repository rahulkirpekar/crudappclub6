package com.royal.dao;

import com.royal.bean.UserBean;

public class UserDao 
{
	public UserBean getUserByEmailId(String emailId,String password) 
	{
		UserBean userBean = new UserBean();
		String selectByEmailId = "select * from user where emailid = ? AND password=?";
		
		// logic
		
		return userBean;
	}
	
	public static void main(String[] args) 
	{
		
		
	}
}
