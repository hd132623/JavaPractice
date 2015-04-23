package org.dimigo.oop;

public class car_test {

	public static void main(String[] args) {
		int i = 0;
		Car2 car = new Car2("현대자동차","제네시스","검정색",225,50000000);
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
			car = new Car2("기아자동차","K7","흰색",246,40000000);
		}
		else if(i==2){
			car = new Car2("삼성자동차","5M7","회색",200,38000000);
		}
		}
	}

}
