package com.xworkz.inheritance;

public class WhatsAppV003 extends WhatsAppV002{
	public WhatsAppV003() {
		System.out.println("WhatsApp Version 3 Created");
		this.version="Version 3";
		this.yearOfRelease=2018;
	}
	
	public void videoCall() {
		System.out.println("Video Call Started");		
	}
	public void sendPictures() {
		System.out.println("Can Send Pictures");
	}

}
