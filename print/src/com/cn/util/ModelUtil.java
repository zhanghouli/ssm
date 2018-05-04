package com.cn.util;

import java.util.Date;
/*
* @Author zhanghl
* @Description model工具类
* @Date 14:54 2018/4/26
* @Param
* @return
**/
public class ModelUtil{
	
    /*
    * @Author zhanghl
    * @Description 设置更新时间、创建时间、创建人、修改人、单据状态,版本号
    * @Date 15:00 2018/4/26
    * @Param [model]
    * @return com.dongxu.live.util.IFiled
    **/
    public static IFiled setProperties(IFiled model,String name) {
        Date nowDate = new Date();
        if(model.getId() != null) { // 插入操作
            model.setModifyTime(nowDate);
            model.setModifier(name);
        }else{
            model.setCreateTime(nowDate);
            model.setCreator(name);
			model.setIsValid(OrderCodeConstant.IsValidCode);
			model.setVersion(OrderCodeConstant.VersionCode);
        }
        return model;
    }

}
