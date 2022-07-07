package com.i.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		int total = kor + math + eng;
		double avg = total/3.0;
		if (avg >= 90) {
			System.out.println("A");
		}
		else if (avg >= 80 && avg <=89) {
			System.out.println("B");
		}
		else if (avg >= 70 && avg <=79) {
			System.out.println("C");
		}
		else if (avg >= 60 && avg <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
