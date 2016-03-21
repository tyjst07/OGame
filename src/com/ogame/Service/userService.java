package com.ogame.Service;

import com.ogame.entities.users;

public interface userService {

	public users getUserId(String userName,String password);
	
	public boolean addUser(String userName,String password);

	public users getUserId(String userName);
	
}
