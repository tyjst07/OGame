package com.ogame.Dao;

import com.ogame.entities.users;

public interface usersDao {
	public users getUser(String username,String password);
	public boolean addUser(String username,String password);
	public users ifHaveUser(String userName);
	public users getById(int id);
}
