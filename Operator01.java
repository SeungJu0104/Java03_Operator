                                                                                               package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		//static 메소드 호출(실행)
		//클래스명.메소드명();
		Operator01.test01();
		
		//non static 메소드 호출(실행)
		//클래스명 변수명 = new 클래스명();
		//변수명.메소드명();
		//동일 클래스 내에서는 클래스명 변수명 = new 클래스명();은 한번만 적어도 된다.
		Operator01 op01 = new Operator01();
		op01.test02();
		op01.test03();
		
	}
	
	//! : 논리 부정 연산자
	//!true -> false   !false -> true
	public static void test01() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		//정수 입력 받아 짝수인지 확인.
		Scanner scn = new Scanner(System.in);//non static 메소드 호출. 클래스명 변수명 = new 클래스명
		
		System.out.print("정수 하나 입력 : ");
		int num = scn.nextInt();//nextInt 메소드 실행.
		
		scn.close();
		
		System.out.println("입력한 정수가 짝수인가? " + (num % 2 == 0));//비교연산자(==)로 true 또는 false인지 확인해 출력. num % 2 != 1도 가능. !(num % 2 == 1)도 가능.
		System.out.println("입력한 정수가 홀수인가? " + (num % 2 != 0));//비교연산자(==)로 true 또는 false인지 확인해 출력. num % 2 == 1도 가능. !(num % 2 == 0)도 가능.
		
		//[문자열과 숫자 출력]
		System.out.println("입력값 " + 10 + 50 + "이다.");//문자열 뒤 또는 문자열과 문자열 사이에 입력된 숫자는 계산을 따로 수행하지 않고 출력.
		System.out.println(10 + 50 + "이다.");//문자열 앞의 숫자는 계산을 수행하고 출력.
	}
	
	//++ -- : 증감연산자
	//증감연산자는 +든 -든 반드시 1씩만 연산한다.
	public void test02() {
		//Scanner scn = new Scanner(System.in);//non static 메소드 호출. 클래스명 변수명 = new 클래스명
		int age = 20;
		
		System.out.println("현재 나이는 ? " + age);
		
		++age;//전위연산자 : ++ -- 변수명 또는 값. 먼저 증감 연산 후 다른 연산을 실행.
		System.out.println("++age의 결과 : " + age);
		
		age++;//후위연산자 : 변수명 또는 값 ++ --. 다른 연산 후 증감 연산 실행.
		System.out.println("age++의 결과 : " + age);
		
		--age;//전위연산자
		System.out.println("--age의 결과 : " + age);
		
		int num1 = 20;
		int res = num1++ *3;//후위연산자. 다른 연산 후 증감 연산 실행.
		//(20*3)을 먼저 계산하고 num1에 1을 더한다. 그래서 res는 60. num1은 21.
		//res = num1*3; num = num1+1; 이러한 형태로 계산이 이뤄진다.
		System.out.println("num1 : "+ num1);
		System.out.println("res : " + res);
		
		int num2 = 20;
		int res2 = ++num2 *3;//전위연산자. 증감 연산 후 다른 연산 실행.
		//(20+1)을 먼저 계산하고 21*3을 수행한다. 그래서 num2는 21. res2는 63.
		//num2 = num2 + 1; res2 = num2 * 3; 이러한 형태로 계산이 이뤄진다.
		System.out.println("num1 : "+ num2);
		System.out.println("res : " + res2);
		
	}
	//>= <= > < == != : 비교연산자
	//두개의 값(변수)를 비교하여 조건에 만족하면 true, 아니면 false를 반환.
	public void test03() {
		int a = 10, b = 20;
		boolean res1, res2, res3;
		
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a > b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}
	
}
