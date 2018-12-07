package se.bodenas.advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Util {


	public static List<String> getInput(String filename) throws IOException {
		return Files.readAllLines(Paths.get("res", filename), StandardCharsets.UTF_8);
	}
}
