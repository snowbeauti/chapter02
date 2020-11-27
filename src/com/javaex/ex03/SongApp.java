package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song();
		
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear("2010");
		iu.setTrack(3);
		
		iu.showinfo();
		
		
		Song bigbang = new Song();
		
		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setComposer("G-DRAGON");
		bigbang.setYear("2007");
		bigbang.setTrack(2);
		
		bigbang.showinfo();
		
		
		Song busker = new Song("벛꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4);
		
		busker.showinfo();

			}

}
