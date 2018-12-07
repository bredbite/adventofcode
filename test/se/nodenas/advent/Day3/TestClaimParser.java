package se.nodenas.advent.Day3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import se.bodenas.advent.Day3.Claim;
import se.bodenas.advent.Day3.ClaimParser;
import se.bodenas.advent.Day3.Rectangle;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClaimParser {

    private static List<Claim> list;

    @BeforeAll
    public static void setup() throws IOException {
        list = new ClaimParser().parse(Util.getInput("input3.txt"));
    }

    @Test
    public void parse_nbrOfLines() {
        assertEquals(1295, list.size());
    }

    @Test
    public void parse_values() {
        Claim claim = list.get(9);
        assertEquals("10", claim.getId());
        Rectangle rectangle = claim.getRectangle();
        assertEquals("277", rectangle.getX());
        assertEquals("701", rectangle.getY());
        assertEquals("12", rectangle.getWidth());
        assertEquals("25", rectangle.getLength());
    }

}
