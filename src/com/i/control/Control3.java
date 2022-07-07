package com.i.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 사이의 숫자를 입력하세요");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("1 선택");
		}
		else if (select == 2) {
			System.out.println("2 선택");
		}
		else {
			System.out.println("3 선택");
		}

	}

}
