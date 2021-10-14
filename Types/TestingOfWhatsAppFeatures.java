package com.xworkz.inheritance;

public class TestingOfWhatsAppFeatures {

	public static void main(String[] args) {
		WhatsAppV001 whatsAppV001=new WhatsAppV001();
		System.out.println(whatsAppV001.version);
		whatsAppV001.createGroup();
		
		WhatsAppV002 whatsAppV002=new WhatsAppV002();
		System.out.println(whatsAppV002.version);
		whatsAppV002.setProfilePicture();
		
		WhatsAppV003 whatsAppV003=new WhatsAppV003();
		System.out.println(whatsAppV003.version);
		whatsAppV003.videoCall();  
	}

}
