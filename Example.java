package com.practice;

import java.util.Scanner;

public class Example {
	
	Scanner scn = new Scanner(System.in);
	
	public void sample1() {
		
		System.out.print("국어: ");
		int kor = scn.nextInt();
		
		System.out.print("영어: ");
		int eng = scn.nextInt();
		
		System.out.print("수학: ");
		int math = scn.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40) {
			if(avg >= 60) {
				System.out.println("합격");
			}
			else System.out.println("불합격");
		}
		else System.out.println("불합격");
		
	}
	
	public void sample2() {
		
		System.out.print("학생이름 : ");
		String name = scn.next();
		
		System.out.print("학년 : ");
		int grade = scn.nextInt();
		
		System.out.print("반 : ");
		int cl = scn.nextInt();
		
		System.out.print("번호 : ");
		int no = scn.nextInt();
		
		System.out.print("성별(Male/Female) : ");
		char sex = scn.next().charAt(0);
		
		System.out.print("성적 : ");
		double sum = scn.nextDouble();
		
		System.out.printf("%s학년 %d반 %d번 성별이 %c인 학생 %s은 성적이 %.2f이다.", name, grade, cl, no, sex, sum);
		
		//실수 둘째자리까지 입력받음이 어떤 의미?
		
	}
	
	public void sample3() {
		
		System.out.print("정수 입력: ");
		int no = scn.nextInt();
		
		String num;
		
		if(no % 2 == 0) {
			num = "짝수다.";
		}
		else num = "홀수다.";
		
		System.out.println(num);
		
		
	}
	
	
	

}
