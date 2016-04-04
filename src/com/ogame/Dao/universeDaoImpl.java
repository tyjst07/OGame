package com.ogame.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ogame.entities.universe;

@Repository
public class universeDaoImpl implements universeDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean init(int uid, String planetName,int id) {
		String hql = "update universe set uid = ?,planetname = ? where id = ?";
		int update = sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, uid).setString(1, planetName).setInteger(2, id).executeUpdate();
		if(update>0)
			return true;
		else
			return false;
	}

	@Override
	public universe getByUid(int uid) {
		String hql = "from universe where uid = ?";
		return (universe) sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, uid).uniqueResult();
	}

	@Override
	public universe getById(int id) {
		String hql = "from universe where id = ?";
		return (universe) sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, id).uniqueResult();
	}
	
	@Override
	public List<universe> getByUniverse(int universe) {
		String hql = "from universe where universe = ? order by location";
		List<universe> universeList = sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, universe).list();
		return universeList;
	}
	
	@Override
	public universe getByLocation(int universe, int location) {
		String hql = "from universe where universe = ? and location = ?";
		return (universe) sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, universe).setInteger(1, location).uniqueResult();
	}

}
