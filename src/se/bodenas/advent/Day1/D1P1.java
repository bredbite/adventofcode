package se.bodenas.advent.Day1;

import se.bodenas.advent.Input;

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
