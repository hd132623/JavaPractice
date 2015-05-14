package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 =>");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 =>");
		int math = scanner.nextInt();
		System.out.println("영어점수 입력 =>");
		int eng = scanner.nextInt();
		double ava = (double)(kor+math+eng)/3;
		int hap = kor+math+eng;
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력 >>\n");
		sb.append("국어 점수 : ").append(kor).append("점\n");
		sb.append("수학 점수 : ").append(math).append("점\n");
		sb.append("영어 점수 : ").append(eng).append("점\n")
		.append("총점").append(hap).append("점\n")
		.append("평균 : ").append(String.format("%.3f",ava)).append("점");
		System.out.println(sb.toString());
		

	}

}
