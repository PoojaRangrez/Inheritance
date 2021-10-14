package com.xworkz.inheritance;

public class WhatsAppV002 extends WhatsAppV001{
	
	public WhatsAppV002() {
		System.out.println("WhatsApp V002 Created");
		this.version="V002";
		this.yearOfRelease=2017;
	}
	public void voiceCall() {
		System.out.println("Voice Call Started");
	}
	public void setProfilePicture() {
		System.out.println("Profile picture sync done");
	}

}
