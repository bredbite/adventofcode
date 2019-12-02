package se.nodenas.advent.Day3;

import org.junit.jupiter.api.Test;
import se.bodenas.advent2018.Day3.ClaimParser;
import se.bodenas.advent2018.Day3.HitAnalyzer;
import se.bodenas.advent2018.Day3.HitMapCalculator;
import se.bodenas.advent2018.Input;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestHitAnalyzer {

    @Test
    public void test_findAllClaimWithoutOverlap() throws IOException {
        var lines = Input.DAY3.getAllLines();
        var claims = new ClaimParser().parse(lines);
        var hitMap = new HitMapCalculator().calculateOverlapScoreBoard(claims);
        assertEquals(1, new HitAnalyzer().findAllClaimWithoutOverlap(hitMap).count());
    }
}
