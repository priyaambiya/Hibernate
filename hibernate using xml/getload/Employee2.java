package com.hibernate.getload;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empdata2")
public class Employee2
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int eId;
	
	@Column(name="empname")
	private String eName;
	@Column(name="empaddr")
	private String eAddr;

	
	public int geteId() 
	{
		return eId;
	}
	
	public void seteId(int eId)
	{
		this.eId = eId;
	}
	public String geteName() 
	{
		return eName;
	}
	public void seteName(String eName) 
	{
		this.eName = eName;
	}
	public String geteAddr() 
	{
		return eAddr;
	}
	public void seteAddr(String eAddr) 
	{
		this.eAddr = eAddr;
	}

}
