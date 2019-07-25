package com.app.dao;

import com.app.pojos.*;

public interface IUserDao {

	Users validateUser(String username,String pass);
	

}
