package com.cn.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.cn.entity.Customer;
import com.cn.provider.CustomerProvider;

public interface CustomerDao{

	/*@Insert("insert into customer(id_card,name,creator,create_time,is_valid,version)" +
            "VALUES(#{idCard},#{name},#{creator},#{createTime},#{isValid},#{version})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertCustomer(Customer customer);

    @Update("update customer " +
            "set modifier = #{modifier}," +
            "modify_time = #{modifyTime}," +
            "id_card = #{idCard}," +
            "name = #{name}" +
            "where id = #{id}")
    Integer updateById(Customer customer);

    @UpdateProvider(type = CustomerProvider.class,method = "updateById")
    Integer deletePretendById(String id);

    @Select("select id,name,id_card as idCard from customer")
    List<Map<String,Object>> selectList();

    @Select("select id,name,id_card as idCard from customer where id = #{id}")
    Map<String,Object> selectById(Integer id);*/
}
