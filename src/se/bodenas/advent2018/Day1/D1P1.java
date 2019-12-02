package se.bodenas.advent2018.Day1;

import se.bodenas.advent2018.Input;

import java.io.IOException;

public class D1P1 {

	public static void main(String[] args) {
		try {
            System.out.println(Input.DAY1.getAllLines().stream().mapToInt(Integer::valueOf).sum());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
