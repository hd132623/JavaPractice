package org.dimigo.oop;

import java.util.Scanner;


public class Question {

	public static void main(String[] args) {
		int i =0;
		String qu = "가수";
		String key = "아이유"; 
		String answer ="";
		while(i<3){
			if(i==1){
				qu = "배우";
			}
			else if(i==2){
				qu = "과목";
				key = "자바";
			}
		while(true){
			System.out.println("가장 좋아하는 "+qu+"는?");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			answer = scanner.nextLine();
			if(answer.equals(key)){
				break;
			}
			else{
				System.out.println("틀렸습니다~~");
				break;
			}
		//Scanner.close();
		}
		System.out.println("정답입니다~~");
		i++;
		}
	}
}