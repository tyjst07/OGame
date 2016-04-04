package com.ogame.Service;

import com.ogame.entities.resource;

public interface resourceService {

	public resource getById(int id);
	public resource getByUid(int uid);
	public boolean updateResource(int id);
	public boolean updateResourceLevelUp(int id,String type);
	public boolean add(int uid);
	public boolean updateResourceNew(int id,String type,int add);
}
