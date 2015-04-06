package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = ""; 
		int basic_cost = 0;
		System.out.println("<< 고속도로 통행료 계산 >>");
		int d =(int) (Math.random() * 3) +1; //차종 결정
		
		switch (d) {
		case 1:
			car = "고속버스";
			basic_cost = 850;
			break;
		case 2:
			car = "경차";
			basic_cost = 300;
			break;
		case 3:
			car = "그 외"; //확률 적음
			basic_cost = 600;
			break;
		default :
			return;
		}

		int distance = (int)(Math.random() * 32); //거리 랜덤 설정
		
		if (distance >30) distance = 30; // 30km초과시 30km로 간주
		System.out.println("거리 : "+ distance + "km"); //거리 출력
		
		if (distance %10 ==0) distance --; //거리가 10의 배수일때 1을 빼서 계산
		if(d==1) basic_cost+=300*(distance/10); // 거리에 따른 통행료 계산-고속버스
		else basic_cost+=200*(distance/10); // 거리에 따른 통행료 계산 - 경차, 그외
		
		System.out.println("차종 : "+ car); //차종 출력
		System.out.println("통행료 : "+basic_cost+"원"); //통행료 출력
	}
	
}