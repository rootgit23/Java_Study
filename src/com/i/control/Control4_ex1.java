package com.i.control;

import java.util.Scanner;

public class Control4_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		int total = kor + math + eng;
		double avg = total/3.0;
		int a = (int)(avg / 10);
		switch (a) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
