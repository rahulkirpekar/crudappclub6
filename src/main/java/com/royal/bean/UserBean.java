package com.royal.bean;

public class UserBean 
{
	private Integer id ;
	private String emailid         ;
	private String password;
	
	public UserBean() 
	{
	}
	public UserBean(Integer id, String emailid, String password) 
	{
		this.id = id;
		this.emailid = emailid;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
