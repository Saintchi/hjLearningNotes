package com.hyunji.learning.commons.utils;

import java.security.MessageDigest;

public class HashUtils {

	public static byte[] md5Hash(String input) {
		try {
			byte[] by = input.getBytes("UTF-8");
			MessageDigest det = MessageDigest.getInstance("MD5");
			return det.digest(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
