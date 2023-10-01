package com.test01;

import java.util.Scanner;

public class Operator02 {
	

	public static void main(String[] args) {
		//non static 메소드 실행
		//클래스명 변수명 = new 클래스명(); (해당 코드는 한 클래스에 한번만 써도 무방하다.)
		//변수명.메소드명();
		//또는 new 클래스명().메소드명();
		
		//Operator02 val = new Operator02();
		//val.test01();
		//new Operator02().test01();
		new Operator02().test02();
		new Operator02().test03();

	}
	//&&(AND, ~면서) 또는 ||(OR, ~거나) : 비교연산자
	//둘 이상의 논리 값(true, false)을 연산한다. 결과 값도 논리 값(true, false)을 갖는다.
	public void test01() {
		int num = 15;
		//&&는 둘 이상의 논리 값들이 모두 참이어야 true를 출력. 나머지는 false.
		System.out.println("1~100의 숫자인지 확인: " + ((num>=1) && (num<=10)));//true && true -> true
		
		Scanner scn = new Scanner(System.in);
		//java.util.Scanner scn = new java.util.Scanner(System.in);//이 경우 import할 필요는 없다. 단, 자주 쓰지는 않는다.
		
		System.out.print("문자 하나 입력: ");
		char ch = scn.next().charAt(0);//문자열로 입력받아 charAt(인덱스의 위치)를 이용해 문자로 변환.
		
		System.out.println("영어 대문자인지 확인: " + ((ch>='A') && (ch<='Z')));
		//문자와 숫자는 자동형변환이 일어난다.(각 문자는 유니코드 값을 갖고 있다.)
		//자동형변환을 이용해 문자 값이 범위 안에 있는지 아닌지 구별.
		
		System.out.print("y 또는 Y 입력: ");
		char ch2 = scn.next().charAt(0);
		
		//||는 둘 이상의 논리 값들 중 하나 이상만 참이면 true를 출력. 모두 거짓이어야 false 출력.
		System.out.println("영문자 y인지 확인 : " + ((ch2 == 'y') || (ch2 == 'Y')));
		
		scn.close();
		
	}
	
	//(조건식) ? (참일 때 연산식 또는 값) : (거짓일 때 연산식 또는 값); : 삼항연산자
	//중첩 가능. 조건식은 반드시 결과가 논리 값을 가져야한다.
	public void test02() {
		int num = -2;
		//String res = num>0?"양수":"양수가 아니다.";//정상 실행. 조건식의 결과 값은 반드시 논리 값을 가져야한다.
		
		String res = (num>0)?"양수":((num == 0)?"0이다.":"음수");//삼항연산자 중첩 가능.
		
		System.out.println(res);
		
	}
	//+= -= *= /= %= : 복합대입연산자(산술대입)
	//증감연산자와 유사하나 원하는 값 만큼 증감이 가능한 것이 다르다.
	public void test03() {
		int num = 12;
		
		num += 3;//num = num + 3; 과 동일한 코드.
		System.out.println(num);
		
		num -= 3;
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /= 2;
		System.out.println(num);
		
	} 

}
