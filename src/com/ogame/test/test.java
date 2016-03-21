package com.ogame.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.ogame.Controller.usersController;
import com.ogame.entities.users;

public class test {
	
	private SessionFactory sessionFactory;
	private ApplicationContext ctx = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void ifHaveUser() {
		
		String hql="from users u where u.username = 'test' and u.password = '123456'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<users> user = query.list();
		System.out.println(user);
		System.out.println(user.get(0));
	}
	

}
