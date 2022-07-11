package com.im.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 인원수를 입력받아서 인원수 만큼 이름을 입력받아서 이름들을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력");
		int num = sc.nextInt();
		String [] s = new String[num];
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+1 + "번째 사람의 이름을 입력");
			s[i] = sc.next();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+1 + "번째 사람 : " + s[i]);
		}
		
		//각 학생의 이름별로 국어 점수 입력 후 출력
		int [] n = new int[num];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "학생의 국어 점수 입력");
			n[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "의 국어점수 " + n[i]);
		}
		
		//반의 국어 점수 총점을 계산하고 출력
		int total = 0;
		for (int i = 0; i < s.length; i++) {
			total += n[i];
		}
		System.out.println("총점 : " + total);
	}

}
