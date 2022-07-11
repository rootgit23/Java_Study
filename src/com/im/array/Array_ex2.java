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
		for (int i=0; i < s.length; i++) {
			System.out.println(s[i]);
			System.out.println(hp[i]);
		}
		
	}

}
