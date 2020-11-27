package com.javaex.ex08;

//메소드 오버로드 예제

public class Math {
	//public Math() {}
	//getter/setter x(필드없음)
	
	//메소드 일반메소드
	public int plus (int a, int b) {
	int sum = a + b;
	return sum;
	}
	
	public double plus (double a, double b) {
		double sum = a + b;
		return sum;
	}
}
