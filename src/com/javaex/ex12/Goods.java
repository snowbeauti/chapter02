package com.javaex.ex12;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void shoInfo() {
		System.out.println("제품명: " + name + ", 가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	

}
