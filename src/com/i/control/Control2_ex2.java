package com.i.control;
import java.util.Scanner;
public class Control2_ex2 {

	public static void main(String[] args) {
		//입력한 숫자 알파벳으로 암호
		char ch = 'a';
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num <= 25) {
			char code = (char)(ch + num);
			System.out.println(code);
		}
		else {
			int c = num % 26;
			ch = 'a';
			char code = (char)(ch+c);
			System.out.println(code);
		}
		
		System.out.println("1~5사이의 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("알파벳을 입력하세요");
		char ch1 = sc.next().charAt(0);
		char code = (char)(ch1 + num1);
		int code1 = (int)code;
		if (code1 >= 123) {
			int c = code1 - 123;
			ch1 = 'a';
			char code3 = (char)(ch1+c);
			System.out.println(code3);
		}
		else {
			System.out.println(code);
		}
		//study edition
	}

}
