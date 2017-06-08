package com.sig.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyJavaUtil_security {

	public String md5(String data){
		
		MessageDigest messageDigest;
		String data_MD5 = "";

		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(data.getBytes());
			byte[] messageDigestMD5 = messageDigest.digest();
			StringBuffer stringBuffer = new StringBuffer();
			for (byte bytes : messageDigestMD5) {
				stringBuffer.append(String.format("%02x", bytes & 0xff));
			}

			data_MD5 = stringBuffer.toString();
			
		} catch (NoSuchAlgorithmException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
		return data_MD5;
	}
}
