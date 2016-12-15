/*****************************************************************************

 ****************************************************************************/

/*
 * User: Arjun
 * Date: Dec 1, 2011
 */

package com.ubiquity.app.entity.fashionlooks;

import java.util.Random;

public class MathUtils {

	public static String generateReferralKey() {

		// SecureRandom random = new SecureRandom();
		// return new BigInteger(130, random).toString(32);
		return generateString(5);
	}

	public static String generateReferralKey(int length) {

		// SecureRandom random = new SecureRandom();
		// return new BigInteger(130, random).toString(32);
		return generateString(length);
	}

	public static String generateString(int length) {
		Random random = new Random();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(random.nextInt(characters.length()));
		}
		return new String(text);
	}

	public static boolean equals(Long v1, Long v2) {
		if (v1 == null || v2 == null || v1 == -1 || v2 == -1)
			return false;
		return v1.longValue() == v2.longValue();
	}

	public static boolean equals(Long v2, Integer v1) {
		if (v1 == null || v2 == null || v1 == -1 || v2 == -1)
			return false;
		return v1.longValue() == v2.longValue();
	}

	public static boolean equals(Integer v1, Integer v2) {
		if (v1 == null || v2 == null || v1 == -1 || v2 == -1)
			return false;
		return v1.intValue() == v2.intValue();
	}

	public static String convertToLakhs(Long l) {
		long hundreds = l % 1000;
		long thousands = (l / 1000) % 100;
		long lakhs = l / 100000;
		long crores = l / 10000000;
		String hundredString = hundreds < 10 ? ("00" + hundreds) : hundreds < 100 ? ("0" + hundreds) : ("" + hundreds);
		String thousandString = thousands < 10 ? ("0" + thousands) : ("" + thousands);
		String lakhsString = crores > 0 ? (lakhs < 10 ? ("0" + lakhs) : ("" + lakhs)) : ("" + lakhs);
		return lakhsString + "," + thousandString + "," + hundredString;
	}
}
