package se.bodenas.advent.Day1;

import se.bodenas.advent.Util;

import java.io.IOException;

public class D1P1 {

	public static void main(String[] args) {
		try {
			System.out.println(Util.getInput("first_input.txt").stream().mapToInt(Integer::valueOf).sum());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
