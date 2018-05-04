package com.cn.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.entity.PrintField;

@Repository("printfielDao") 
public interface IPrintFieldDao {
	  
    /*int deleteByPrimaryKey(Integer id);  
  
    int insert(PrintField record);  
  
    int insertSelective(PrintField record);  
  
    PrintField selectByPrimaryKey(Integer id);  
  
    int updateByPrimaryKeySelective(PrintField record);  
  
    int updateByPrimaryKey(PrintField record); */ 
    //自己添加的，已匹配Mapper中的Sql  
    List<PrintField> selectAllUser();  
}
