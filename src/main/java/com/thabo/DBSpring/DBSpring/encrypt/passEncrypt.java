package com.thabo.DBSpring.DBSpring.encrypt;

import org.springframework.stereotype.Component;

@Component
public class passEncrypt {
	
	public String encryptText(String toEncrypt) {

	    String tempEn = toEncrypt + "";
	    String encryptText ="";
	    for(int i=0;i<tempEn.length();i++) {
	        int a = (int)tempEn.charAt(i);
	        a+=148113; // your Secret Key
	        encryptText +=(char)a;
	    }
	    return encryptText;
	}

}
