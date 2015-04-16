package org.dimigo.oop;

public class car {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}

	
	public void setCompany(String newcompany){
		company = newcompany;
	}
	public void setModel(String newmodel){
		model = newmodel;
	}
	public void setColor(String newcolor){
		color = newcolor;
	}
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed = newmaxSpeed;
	}
	public void setPrice(int newprice){
		price = newprice;
	}
}
