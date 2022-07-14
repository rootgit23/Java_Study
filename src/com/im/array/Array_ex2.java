package com.im.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		// 몬스터 생성
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		//몬스터 파티 생성
		//몬스터의 수 입력(1~4)
		//입력한 수 만큼 몬스터를 랜덤하게 뽑고 출력
		System.out.println("몬스터 수를 입력 1~4");
		int mon = sc.nextInt();
		String [] s = new String[mon];
		int [] hp = new int [mon];
		for (int i=0; i < s.length; i++) {
			int index = random.nextInt(4);
			s[i] = monsterNames[index];
			hp[i] = monsterHps[index]; 
		}
		
		//1.공격사냥 2. 도망
		//0~6미만에 랜덤한 데미지로 몬스터를 공격
		boolean a = true;
		while(a) {
			int death = 0;
			for(int i=0; i < s.length; i++) {
				System.out.println(s[i]);
				System.out.println(hp[i]);
			}
			System.out.println("1번 공격 2번 도망");
			int b = sc.nextInt();
			
			if(b==1) {
				for (int i=0; i < hp.length; i++) {
					int damage = random.nextInt(magicPower);
					hp[i] = hp[i] - damage;
					System.out.println(s[i]);
					System.out.println(hp[i]);
					if (hp[i] <= 0) {
						death++;
						System.out.println("잡은 몬스터 수 :" + death);
					}
				}
			}
			else
				a = false;
		}
		for(int i=0; i < s.length; i++) {
			System.out.println(s[i]);
			System.out.println(hp[i]);
		}
	}

}
