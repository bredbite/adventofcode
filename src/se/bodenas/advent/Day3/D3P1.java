package se.bodenas.advent.Day3;

import org.junit.jupiter.api.Test;
import se.bodenas.advent.Input;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class D3P1 {
    @Test
    public void main() throws IOException {
        // How many square inches of fabric are within two or more claims?
        assertEquals(104126, getResult());
    }

    private int getResult() throws IOException {
        var claims = getClaims();
        var hitMap = new HitMapCalculator().calculate(claims);
        return new IntersectionFinder().find(hitMap);
    }

    private List<Claim> getClaims() throws IOException {
        var lines = Input.DAY3.getAllLines();
        return new ClaimParser().parse(lines);
    }
}
