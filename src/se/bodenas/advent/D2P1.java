package se.bodenas.advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D2P1 {

	public static void main(String[] args) {
		try {
			List<String> ids = Util.getInput("second_input.txt");
			int threes = 0;
			int twos = 0;
			for (String id : ids) {
				Map<Character, Integer> wordScoreBoard = new HashMap<>();
				for (char letter : id.toCharArray()) {
					Integer letterScore = wordScoreBoard.computeIfAbsent(letter, i -> 0);
					wordScoreBoard.put(letter, letterScore + 1);
				}
				if (wordScoreBoard.values().stream().anyMatch(i -> i == 3)) {
					threes++;
				}
				if (wordScoreBoard.values().stream().anyMatch(i -> i == 2)) {
					twos++;
				}

			}
			System.out.println("Result: " + threes * twos);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
