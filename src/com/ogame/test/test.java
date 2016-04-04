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
		String sql = "insert into universe(universe,location) values";
		for(int i=1;i<=300;i++)
			for(int j=1;j<=15;j++)
			{
				if(j==1&&i==1){
					sql += "("+i+","+j+")";
				}
				else{
					sql += ",("+i+","+j+")";
				}
			}
		System.out.println(sql);
		sessionFactory.getCurrentSession().createSQLQuery(sql);
	}
	

}
