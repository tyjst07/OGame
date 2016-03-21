package com.ogame.Service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogame.Dao.resourceDao;
import com.ogame.entities.resource;

@Service
public class resourceServiceImpl implements resourceService {

	@Autowired
	private resourceDao resourceDao;
	
	@Override
	public resource getById(int id) {
		return resourceDao.getById(id);
	}

	@Override
	public resource getByUid(int uid) {
		return resourceDao.getByUid(uid);
	}

	@Override
	public boolean updateResource(int id) {
		Date date = new java.util.Date();
		long nowtime = date.getTime();
		resource resource = resourceDao.getById(id);
		long time = nowtime/1000 - resource.getTime();
		int metal = (int) (resource.getMetal()+time*resource.getMetalAdd());
		int beton = (int) (resource.getBeton()+time*resource.getBetonAdd());
		int fuel = (int) (resource.getFuel()+time*resource.getFuelAdd());
		return resourceDao.update(id, metal, beton, fuel, nowtime/1000);
	}

	@Override
	public boolean updateResourceLevelUp(int id, String type) {
		updateResource(id);
		return resourceDao.updateAdd(id, type);
	}

	@Override
	public boolean add(int uid) {
		// TODO Auto-generated method stub
		return resourceDao.add(uid);
	}
}
