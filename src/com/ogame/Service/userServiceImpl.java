package com.ogame.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogame.Dao.usersDao;
import com.ogame.entities.users;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private usersDao usersdao;
	
	@Override
	public users getUserId(String userName, String password) {
		// TODO Auto-generated method stub
		return usersdao.getUser(userName, password);
	}

	@Override
	public users getUserId(String userName) {
		// TODO Auto-generated method stub
		return usersdao.ifHaveUser(userName);
	}
	
	@Override
	public boolean addUser(String userName, String password) {
		// TODO Auto-generated method stub
		return usersdao.addUser(userName, password);
	}

}
