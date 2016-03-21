package com.ogame.Dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.mysql.jdbc.Util;
import com.ogame.entities.users;

@Repository
public class usersDaoImpl implements usersDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public users getUser(String username, String password) {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return null;
		}
		String hql="from users u where u.username = ? and u.password = ?";
		List<users> user = sessionFactory.getCurrentSession().createQuery(hql).setString(0, username).setString(1, password).list();
		if (user.isEmpty()) {
			return null;
		}else{
			return user.get(0);
		}
	}
	
	@Override
	public users ifHaveUser(String username) {
		if (StringUtils.isEmpty(username)) {
			return null;
		}
		String hql="from users u where u.username = ?";
		List<users> user = sessionFactory.getCurrentSession().createQuery(hql).setString(0, username).list();
		if (user.isEmpty()) {
			return null;
		}else{
			return user.get(0);
		}
	}
	
	@Override
	public boolean addUser(String username,String password){
		String hql = "insert into users(username,password) values(?,?)";
		int ifsuccess = sessionFactory.getCurrentSession().createSQLQuery(hql).setString(0, username).setString(1, password).executeUpdate();
		if(ifsuccess>0){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public users getById(int id) {
		return (users) sessionFactory.getCurrentSession().get(users.class, id);
	}

}
