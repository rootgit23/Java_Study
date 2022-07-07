package com.im.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0~9까지 출력하는 반복문
		// 단 출력은 짝수만 출력
		for(int i=0; i <10; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("===============");
		
		// 0~9 사이의 짝수만 출력 if문 없이
		for(int i=0; i<10; i = i +2) {
			System.out.println(i);
		}
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		String a = "멍멍";
		int num = sc.nextInt();
		for(int i = 0; i< num; i++)
		{
			System.out.println(a);
		}
	}

}
