package com.thabo.DBSpring.DBSpring.decrypt;

import org.springframework.stereotype.Component;

@Component
public class passDecrypt {
	
	public String decryptText(String encryptText) {

	    String decodeText = "";
	    for(int i=0;i<encryptText.length();i++) {
	        int a= (int)encryptText.charAt(i);
	        a -= 148113;
	        decodeText +=(char)a;
	    }

	    return decodeText;
	}

}
