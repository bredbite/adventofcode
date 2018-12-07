package se.bodenas.advent.Day3;

import org.junit.jupiter.api.Test;
import se.bodenas.advent.Input;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class D3P1 {
    @Test
    public void main() throws IOException {
        List<Claim> claims = getClaims();
        Map<Coordinate, Hits> hitMap = new HashMap<>();
        // How many square inches of fabric are within two or more claims?
        assertEquals(Integer.MAX_VALUE, getResult());
    }

    private List<Claim> getClaims() throws IOException {
        List<String> lines = Input.DAY3.getAllLines();
        return new ClaimParser().parse(lines);
    }

    private int getResult() {
        return 0;
    }

}
