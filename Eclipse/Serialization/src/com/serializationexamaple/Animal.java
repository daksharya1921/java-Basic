package com.serializationexamaple;

import java.io.Serializable;

public class Animal implements Serializable,Cloneable
{
	
	private static final long serialVersionUID = 5l;
	
//	private transient String color;
	private  String color;
	private String name;
	private int noOfLegs;
	public Animal(String color,String name,int noOfLegs) {
		this.color = color;
		this.name = name;
		this.noOfLegs = noOfLegs;
	}
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
