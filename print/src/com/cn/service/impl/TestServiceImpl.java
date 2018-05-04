package com.cn.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.CustomerDao;
import com.cn.entity.Customer;
import com.cn.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {

	@Resource  
    private CustomerDao customerDao;  
	@Override
	public Map<String,Object> getUserById(int userId) {
		
	    /*return customerDao.selectById(userId);*/ 
		return null;
	}

}
