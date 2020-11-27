package com.javaex.ex01;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메서드-겟터/세터
	
	//메소드-일반
	
	//setname 등록하는 기능
	public void setName(String name) {
		this.name = name; //제품명
	}
	
	//getName() 읽어주는 기능
	public String getName() {
		return this.name;
	}
	
	//setPrice 가격등록
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//getPprice 읽어주는 기능
	public int getPrice() {
		return this.price;
	}
	
	
	public void showinfo() {
		System.out.println("상품이름: " + name + ", 가격: " + price);
		
	}
	

}
