package com.mindtree.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bean.ResourceBean;
import com.mindtree.dao.ResourceBeanDao;
import com.mindtree.service.ResourceBeanService;

 

@Service
public class ResourceBeanServiceImpl implements ResourceBeanService {
	private final Logger logger = LoggerFactory.getLogger(ResourceBeanServiceImpl.class);
	@Autowired
	private ResourceBeanDao resourceDao;

	public boolean addResourece(ResourceBean resource) {
		boolean result = false;
		logger.info("Service layer -:addResourece method called");
		result = resourceDao.addResourece(resource);
		logger.info("Service layer -:addResourece method completed");
		return result;

	}

	public ResourceBean getResource(int id) {
		logger.info("Service layer -:getResource method called");
		ResourceBean resourceBean = resourceDao.getResource(id);
		logger.info("Service layer -:getResource method completed");
		return resourceBean;
	}

	public int updateResource(ResourceBean resource) {
		logger.info("Service layer -:updateResource method called");
		int value = resourceDao.updateResource(resource);
		logger.info("Service layer -:updateResource method completed");
		return value;
		
	}

	public int removeResource(int id) {
		logger.info("Service layer -:removeResource method called");
		int value = resourceDao.removeResource(id);
		logger.info("Service layer -:removeResource method completed");
		return value;
	}
}
