package com.cn.service;

import java.util.Map;

import org.springframework.stereotype.Service;

public interface ITestService {

	public Map<String,Object> getUserById(int userId); 
}
