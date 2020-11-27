package com.javaex.practice02;

public class TvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Tv tv = new Tv( 7, 20, false);  	
		         
		         tv.status();	
		         
		         tv.power( true );
		         tv.volume( 30 );
		         tv.status();		          
		         
		         tv.volume( false );
		         tv.status();
		         
		         tv.channel( -8 );
		         tv.status();		          
		         
		         tv.channel( true );
		         tv.channel( true );
		         tv.channel( true );
		         tv.status();

		         tv.power( false );
		         tv.status();      		         

	}

}
