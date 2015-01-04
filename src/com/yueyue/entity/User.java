package com.yueyue.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private Integer id;
	private String  name;
	private String  sex;
	private String  address;
	private Double  height;
	private Date    birthday;
	public Integer getId() {
		return id;
	}
	
	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	@XmlAttribute
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getHeight() {
		return height;
	}
	@XmlElement
	public void setHeight(Double height) {
		this.height = height;
	}
	public Date getBirthday() {
		return birthday;
	}
	
	@XmlElement
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", address=" + address + ", height=" + height + ", birthday="
				+ birthday + "]";
	}
}
