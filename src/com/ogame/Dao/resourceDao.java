package com.ogame.Dao;

import com.ogame.entities.resource;


public interface resourceDao {

	public boolean add(int uid);
	public resource getByUid(int uid);
	public boolean update(int id,int metal,int beton,int fuel,long time);
	public boolean updateAdd(int id,String type);
	public resource getById(int id);
	public boolean sub(int id,int metal,int beton,int fuel);
}
