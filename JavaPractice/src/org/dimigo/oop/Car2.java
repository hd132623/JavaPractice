package org.dimigo.oop;

public class Car2 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(){
		
	}
	
	public Car2 (String getCompany, String getModel, String getColor, int getMaxSpeed, int getPrice){
		company = getCompany;
		model = getModel;
		color = getColor;
		maxSpeed = getMaxSpeed;
		price = getPrice;
	}
	
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
	
}
