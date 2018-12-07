package se.bodenas.advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D1P2 {

	public static void main(String[] args) {
		try {
			List<String> changeList = Util.getInput("first_input.txt");
			System.out.println("Input size: "+changeList.size());
			System.out.println("First duplicate frequency: "+findFirstDuplicateSum(changeList));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Integer findFirstDuplicateSum(List<String> changeList) {
		Set<Integer> previousFreq = new HashSet<>();
		previousFreq.add(0);
		Integer sum = 0;
		int iterations = 0;
		int freqChanges = 0;
		while(true) {
			iterations++;
			for (String changeString : changeList) {
				freqChanges++;
				Integer change = Integer.valueOf(changeString);
				sum = sum + change;
				if (previousFreq.contains(sum)) {
					System.out.println("Iterations: "+iterations);
					System.out.println("Frequency changes: "+freqChanges);
					return sum;
				}
				previousFreq.add(sum);

			}
		}
	}
}