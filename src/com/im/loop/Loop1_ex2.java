package com.im.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1번 대문자 2번 소문자
		//1번이면 대문자 A~Z
		//2번이면 소문자 a~z
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 or 2번을 입력해주세요");
		int num = sc.nextInt();
		if (num == 1) {
			for(int i = 65; i < 91; i++) {
				char a = (char)(i);
				System.out.println(a);
			}
		}
		else {
			for(int i = 97; i < 123; i++) {
				char a = (char)(i);
				System.out.println(a);
			}
		}
		
		System.out.println("==========================");
		
		// 1부터 10까지의 합을 구해라
		int total = 0;
		for(int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println("1부터 10까지의 합 = " + total);
		System.out.println("==============================");
		// 최대 5번까지 로그인 기회 허용
		// 중간에 로그인 성공하면 탈출
		//아이디 비밀번호를 입력받아 로그인 성공 여부
		int yId = 1234; // id
		int yPw = 5678; // 비번
		int i = 0;
		for(int j=0; j<5;j++) {
			System.out.println("아이디를 입력하세요");
			int a = sc.nextInt();
			System.out.println("비밀번호를 입력하세요");
			int b = sc.nextInt();
			
			if (a == yId && b == yPw) {
				System.out.println("로그인에 성공하였습니다");
				j = 5;
			}
			else {
				i++;
				System.out.println(i + "번 로그인에 실패하였습니다");
			}
		}
		if(i==5) {
			System.out.println("더이상 로그인할 수 없습니다");
		}
	}
}
