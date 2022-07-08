package com.im.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 : 
		//탄창 : 1개당 30발 - 탄창 3개
		
		//처음에 시작할때 선택 1번 단발(30발 1개 탕) , 2번 점사(10발 1개 탕탕탕)
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			System.out.println("1번 or 2번 모드를 선택해주세요");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("단발로 쏩니다");
				for(int j = 0; j<30; j++) {
					System.out.println("탕");
				}
			}
			if(num==2) {
				System.out.println("점사로 쏩니다");
				for(int j=0; j<10; j++) {
					System.out.println("탕탕탕");
				}
			}
		}
		System.out.println("총알이 없습니다");
	}
}
