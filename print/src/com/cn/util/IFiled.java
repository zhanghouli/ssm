package com.cn.util;

import java.util.Date;
/*
* @Author zhanghl
* @Description 基础信息
* @Date 14:54 2018/4/26
* @Param
* @return
**/
public abstract interface IFiled {
    
    public abstract void setCreator(String creator);
    
    public abstract void setCreateTime(Date createTime);
    
    public abstract void setVersion(String version);

    public abstract void setModifyTime(Date modifyTime);
    
    public abstract void setModifier(String modifier);
    
    public abstract Integer getId();
    
    public abstract void setIsValid(Integer isValid);
    
}
