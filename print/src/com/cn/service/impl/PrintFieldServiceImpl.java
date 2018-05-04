package com.cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.IPrintFieldDao;
import com.cn.entity.PrintField;
import com.cn.service.IPrintFieldService;
@Service("printFieldService") 
public class PrintFieldServiceImpl implements IPrintFieldService {
	@Resource(name = "printfielDao")  
	private IPrintFieldDao printFieldDao;  
	  
	@Override
	public List<PrintField> getUser() {
		return printFieldDao.selectAllUser();  
	}

}
