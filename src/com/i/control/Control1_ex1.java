package com.i.control;
import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 국어,영어,수학 점수를 차례로 입력
		//총점과 평균을 계산
		// 평균이 90점 이상이면 우등상 수상 출력
		// 모든 학생들은 졸업 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		if (avg >= 90) {
			System.out.println("우등상 수상");
		}
		System.out.println("졸업");
		
		//2. 평균이 90점이상이면 A를 출력 , 80점이상이면 B , 70점이상이면 C, 60점이상이면 D 그외 나머지는 F
		if (avg >= 90) {
			System.out.println("A");
		}
		if (avg >= 80 && avg < 90) {
			System.out.println("B");
		}
		if (avg >= 70 && avg < 80) {
			System.out.println("C");
		}
		if (avg >= 60 && avg < 70) {
			System.out.println("D");
		}
		if (avg < 60) {
			System.out.println("F");
		}
	}

}
