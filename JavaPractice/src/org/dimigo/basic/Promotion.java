package org.dimigo.basic;

/**
 * 대한민국 커피 전문점 매출1위 디미베네의 연간 인건비를 계산해보자.
 * - 연간 인건비 = 월 평균 급여 * 12 * 점포 내 직원 수 * 점포 수
 * - 천단위 콤마 찍기 : String.format("%,d", 10000) -> 10,000
 *
 * << 디미베네 연간 인건비 >>
 * 월 평균 급여 : 1,700,000원
 * 점포 내 직원 수 : 3명
 * 점포 수 : 1,500개
 * 
 * 연간 인건비 : 91,800,000,000원
 * 
 * @author teacher
 *
 */
public class Promotion {

	public static void main(String[] args) {
		long spare = 1700000;
		long a = 3;
		long b = 1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",spare) + "원");
		System.out.println("점포내 직원 수 : "+ a + "명");
		System.out.println("점포 수 : " + b + "개");
		System.out.printf("\n");
		long qu = spare * a * b *12;
		System.out.println("연간 인건비 : " + String.format("%,d",qu) + "원");
		
		
	}
}
