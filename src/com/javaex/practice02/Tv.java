package com.javaex.practice02;

public class Tv {
	private int channel;
	private int volume ;
	private boolean power;
	
	
	
	

	
	public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;		
	}
		
		public void power(boolean on) {
			this.power = on;
		}
		
		public void channel(int channel) {
			if(channel >255) {
				this.channel = 255;
			} else if(channel<1){
				this.channel = 1;
			}
		}
		
		public void channel(boolean channel) {
			if(channel) {
				this.channel ++;
			} else {
				this.channel --;
			}
		}
		
		public void volume (int volume) {
			if(volume>100) {
				this.volume = 10;
			} else if(volume<0){
				this.volume = 0;
			} 
		}
		
		public void volume(boolean volume) {
			if(volume) {
				this.volume ++;
			} else {
				this.volume --;
			}
		}

	
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	

	void status() {
		if(power) {
		System.out.println("Tv on, channel=" + channel + ", volume=" + volume);
		} else { System.out.println("TV off");
		}
	}

	
	
}
	
