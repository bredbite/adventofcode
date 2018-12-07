package se.bodenas.advent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public enum Input {
    DAY1("input1.txt"),
    DAY2("input2.txt"),
    DAY3("input3.txt"),
    ;

    private String filename;

    Input(String filename) {

        this.filename = filename;
    }

    public List<String> getAllLines() throws IOException {
        return Files.readAllLines(Paths.get("res", filename), StandardCharsets.UTF_8);
    }
}
