package com.im.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//nextInt(정수) : 0부터 입력된 정수 미만 범위내에서 무작위 정수를 뽑는다
		//int num = random.nextInt(10);
		//System.out.println(num);
		//숫자가 0이면 가위, 1이면 주먹, 2이면 보
		boolean a = true;
		while(a) {
			System.out.println("0(가위),1(바위),2(보) 중에 선택하세요");
			int num = sc.nextInt();
			int com = random.nextInt(3);
			System.out.print("컴퓨터 : ");
			switch(com) {
			case 0 :
				System.out.println("가위");
				break;
			case 1 :
				System.out.println("바위");
				break;
			case 2 :
				System.out.println("보");
				break;
			}
			System.out.print("유저 : ");
			switch(num) {
			case 0 :
				System.out.println("가위");
				break;
			case 1 :
				System.out.println("바위");
				break;
			case 2 :
				System.out.println("보");
				break;
			}
			if(num == com) {
				System.out.println("비겼습니다");
			}
			else if ((num == 0 && com == 2) || (num == 1 && com == 0) || (num == 2 && com ==1)) {
				System.out.println("이겼습니다");
				break;
			}
			else  {
					System.out.println("졌습니다");
				}
		}
		
	}

}
