package com.ogame.Service;

import java.util.List;

import com.ogame.entities.universe;

public interface universeService {
	
	public boolean init(int uid);
	public List<universe> getUniverseList(int universe);
	public universe getByUid(int uid);

}
