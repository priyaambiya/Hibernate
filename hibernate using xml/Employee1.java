package com.hibernate;

public class Employee1 
{
	private int eId;
	private String eName;
	private String eAddr;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddr() {
		return eAddr;
	}
	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}
	public Employee1(int eId, String eName, String eAddr) {
		this.eId = eId;
		this.eName = eName;
		this.eAddr = eAddr;
	}

}
