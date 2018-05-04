package com.cn.entity;

import com.cn.util.IFiled;

import java.util.Date;

/**
 * @Author zhanghl
 * @Date 2018/4/26 13:08
 * @Description 请输入一句话用来描述
 **/
public class PrintField  implements IFiled {
    
    private Integer id;

    private String fieldName;

    private Integer sortNumber;

	private double size;

    // 1有效，0无效
    private Integer isValid;

    // 创建人
    private String creator;

    // 创建时间
    private Date createTime;

    // 版本
    private String version;

    // 修改人
    private String modifier;

    // 修改时间
    private Date modifyTime;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Integer getSortNumber() {
		return sortNumber;
	}

	public void setSortNumber(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	
	
}
