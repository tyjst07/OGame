package com.ogame.Dao;

import java.util.List;

import com.ogame.entities.universe;

public interface universeDao {
	
	public boolean init(int uid,String planetName,int id);
	public universe getByUid(int uid);
	public universe getById(int id);
	public List<universe> getByUniverse(int universe);
	public universe getByLocation(int universe,int location);
}
