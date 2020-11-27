package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		
		Goods camera = new Goods();
	
		
		camera.setName("니콘");
		String name = camera.getName();
		System.out.println(name);
		
		camera.setPrice(400000);
		int price = camera.getPrice();
		System.out.println(price);
		
		camera.showinfo();
		
	}

}
