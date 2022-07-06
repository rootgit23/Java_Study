package com.i.control;
import java.util.Scanner;
public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월급을 400 입력받고 1을 입력하면 정규직 2를 입력하면 계약직
		//정규직이면 세금 국민연금은 월급의 1% 건강보험 1.4% 고용보험 0.5% 산재보험 0.7%
		//계약직 월급의 3.3%
	    Scanner sc = new Scanner(System.in);
	    System.out.println("월급을 입력해주세요");
	    int wol = sc.nextInt(); 
	    System.out.println("번호를 입력해주세요");
	    int num = sc.nextInt();
	    if(num==1) {
	    	System.out.println("정규직입니다");
	    	double a = wol*0.01;
	    	double b = wol*0.014;
	    	double c = wol*0.005;
	    	double d = wol*0.007;
	    	int total = (int)(wol - a - b - c - d);
	    	System.out.println("월급은 " + total + "만원 입니다" );
	    }
	    else {
	    	System.out.println("계약직입니다");
	    	double e = wol * 0.033;
	    	int total1 = (int)(wol - e);
	    	System.out.println("월급은 " + total1 + " 만원 입니다");
	    }
	}
}
