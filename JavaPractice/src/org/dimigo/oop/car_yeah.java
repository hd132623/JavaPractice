package org.dimigo.oop;

public class car_yeah {

	public static void main(String[] args) {
		int i = 0;
		car car = new car();
		System.out.println("<< 자동차 목록 >>");
		while(i<3){
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : "+ car.getColor());
		System.out.println("최대속도 : "+car.getMaxSpeed());
		System.out.println("가격 : "+String.format("%,d",car.getPrice()));
		System.out.println();
		i++;
		if(i==1){
			car.setCompany("기아자동차");
			car.setModel("K7");
			car.setColor("흰색");
			car.setMaxSpeed(246);
			car.setPrice(40000000);
		}
		else if(i==2){
			car.setCompany("삼성자동차");
			car.setModel("5M7");
			car.setColor("회색");
			car.setMaxSpeed(200);
			car.setPrice(38000000);
		}
		}
	}

}
