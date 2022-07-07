package com.im.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// 시계 0분 0초 ~ 59분 59초
		//분 과 초 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력해주세요");
		int m1 = sc.nextInt();
		System.out.println("초를 입력해주세요");
		int s1 = sc.nextInt();
		int s2 = 0;
		for(int m = 0; m < 60; m++) {
			for(int s = 0; s < 60; s++) {
				System.out.println(m + "분 :" + s + "초" );
				if(m1 == m && s1 == s) {
					s2 = s;
					s = 60;
				}
			}
			if(m1 == m && s1 == s2) {
					break;
			}
		}
	}

}
