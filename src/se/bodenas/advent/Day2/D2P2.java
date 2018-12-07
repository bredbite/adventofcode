package se.bodenas.advent.Day2;

import se.bodenas.advent.Util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class D2P2 {

	public static void main(String[] args) {
		try {
			String result = "";
			List<String> ids = Util.getInput("second_input.txt");
			for (String id : ids) {
				for (String id2 : ids) {
					if (equalLettersExceptOne(id, id2)) {
						result = getCommonLetters(id, id2);
					}
				}
			}
			System.out.println("Result: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String getCommonLetters(String s1, String s2) {
		char[] currentLetters = s1.toCharArray();
		char[] otherLetters = s2.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < currentLetters.length && i < otherLetters.length; i++) {
			if (currentLetters[i] == otherLetters[i]) {
				result.append(currentLetters[i]);
			}
		}
		return result.toString();
	}

	private static boolean equalLettersExceptOne(String s1, String s2) {
		char[] chars = s1.toCharArray();
		char[] boxIdChars = s2.toCharArray();
		int i = 0;
		boolean hit = false;
		while (i < chars.length && i < boxIdChars.length) {
			if (chars[i] != boxIdChars[i]) {
				if (hit) {
					return false;
				}
				hit = true;
			}
			i++;

		}
		return hit;
	}
}
