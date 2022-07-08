package com.im.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		int s = 0;
		//ID입력 PW입력
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		boolean b = true;
		while(b) {
			System.out.println("로그인 시도 1번 종료 2번을 눌러주세요");
			int a = sc.nextInt();
			if(a == 1) {
				System.out.println("ID를 입력하세요");
				int id = sc.nextInt();
				System.out.println("비번을 입력하세요");
				int pw = sc.nextInt();
				if(id == yId && pw == yPw) {
					System.out.println("로그인 성공");
					s = a;
					b = false;
				}
				else {
					System.out.println("로그인 실패");
				}
			}
			if(a==2) {
				System.out.println("종료합니다");
				b = false;
			}
		}//while 끝
		
		//로그인이 실패했으면 프로그램이 종료
		//로그인을 성공했으면 게임이 시작
		//RPG 시작레벨은 1 만렙은 15
		//GOLD = 1000원
		//5렙 달성시 축하금으로 1000원 지급
		//10렙 달성시 2000원 지급
		//15렙 달성시 3000원 지급
		//모든 몬스터의 경험치는 동일
		//레벨 1 -> 2 로 갈때 잡아야되는 몬스터 수 3
		//레벨 2 -> 3 로 갈때는 6
		// 9
		// 12
		//14 -> 15가 될때 끝
		
		if (s==1) {
			System.out.println("게임을 시작할꺼면 1번 안하실꺼면 2번을 눌러주세요");
		    int a = sc.nextInt();
		    if (a == 1)
		    {
		    	System.out.println("게임시작");
		    	int gold = 1000;
		    	for(int i = 1; i<16; i++) {
		    		if (i % 5 == 0) {
		    			int d = i / 5;
		    			int g = d * 1000;
		    			gold += d * 1000;
		    			System.out.println(i + "레벨 달성 " + g + "골드 보너스가 지급되었습니다");
		    			System.out.println("현재 보유 중인 골드는 " + gold + "입니다");
		    		}
		    		for(int j = 1; j < i*3+1; j++) {
		    			if(i<15) {
		    				System.out.println(i + "레벨" + j + "마리 잡으셨습니다");
		    			}
		    		}
		    		if(i < 15) {
		    			System.out.println("레벨업!");
		    		}
		    	}
		    	System.out.println("만렙입니다");
		    	System.out.println("보유골드는 " + gold + "골드 입니다");
		    }
		    else {
		    	System.out.println("게임을 시작하지 않습니다");
		    }
		}
		
	}

}
