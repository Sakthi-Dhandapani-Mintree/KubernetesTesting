package com.mindtree.dao;

import com.mindtree.bean.ResourceBean;

public interface ResourceBeanDao {

	public boolean addResourece(ResourceBean resource);
	public int updateResource(ResourceBean resource);
	public ResourceBean getResource(int id);
	public int removeResource(int id);
}
