package com.ogame.Dao;


import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ogame.entities.resource;

@Repository
public class resourceDaoImpl implements resourceDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean add(int uid) {
		resource resource = new resource();
		Date date = new Date();
		resource.setTime(date.getTime()/1000);
		resource.setUid(uid);
		sessionFactory.getCurrentSession().save(resource);
		return (resource.getId()>0);
	}

	@Override
	public resource getByUid(int uid) {
		// TODO Auto-generated method stub
		String hql="from resource where uid = ?";
		return (resource) sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, uid).uniqueResult();
	}

	@Override
	public boolean update(int id,int metal, int beton, int fuel, long time) {
		String hql = "update resource set metal = ?,beton = ?, fuel = ?, time = ? where id = ?";
		int update=sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, metal).setInteger(1, beton).setInteger(2, fuel).setLong(3, time).setInteger(4, id).executeUpdate();
		if(update>0)
			return true;
		else
			return false;
	}
	
	@Override
	public resource getById(int id) {
		
		return (resource) sessionFactory.getCurrentSession().get(resource.class, id);
	}

	@Override
	public boolean updateAdd(int id,String type) {
		String hql = "update resource set ? = ?*2 where id = ?";
		int update = sessionFactory.getCurrentSession().createQuery(hql).setString(0, type).setString(1, type).setInteger(2, id).executeUpdate();
		if(update>0)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean sub(int id, int metal, int beton, int fuel) {
		String hql = "update resource set metal = metal - ?,beton = beton - ?,fuel = fuel - ? where id = ?";
		int update = sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, metal).setInteger(1, beton).setInteger(2, fuel).setInteger(3, id).executeUpdate();
		if(update>0)
			return true;
		else
			return false;
	}

}
