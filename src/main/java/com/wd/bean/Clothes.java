package com.wd.bean;

public class Clothes {
	private String id;
	private String param_name;
	private String param_value;
	private String remark;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParam_name() {
		return param_name;
	}
	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}
	public String getParam_value() {
		return param_value;
	}
	public void setParam_value(String param_value) {
		this.param_value = param_value;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "clothes [id=" + id + ", param_name=" + param_name + ", param_value=" + param_value + ", remark="
				+ remark + "]";
	}
	
}
