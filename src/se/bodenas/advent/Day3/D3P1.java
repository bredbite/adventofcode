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
        // How many square inches of fabric are within two or more claims?
        assertEquals(104126, getResult());
    }

    private int getResult() throws IOException {
        var claims = getClaims();
        var hitMap = calculateHitMap(claims);
        return findIntersectingRectangles(hitMap);
    }

    private List<Claim> getClaims() throws IOException {
        var lines = Input.DAY3.getAllLines();
        return new ClaimParser().parse(lines);
    }

    private Map<Integer, Map<Integer, Integer>> calculateHitMap(List<Claim> claims) {
        var hitMap = new HashMap<Integer, Map<Integer, Integer>>();
        for (var claim : claims) {
            var rectangle = claim.getRectangle();
            int xInit = rectangle.getX();
            int yInit = rectangle.getY();
            int width = rectangle.getWidth();
            int height = rectangle.getHeight();
            for (int i = 0; i < width; i++) {
                int x = xInit + i;
                var column = hitMap.computeIfAbsent(x, s -> new HashMap<>());
                for (int j = 0; j < height; j++) {
                    int y = yInit + j;
                    var hits = column.computeIfAbsent(y, h -> 0);
                    column.put(y, ++hits);
                }
            }
        }
        return hitMap;
    }

    private int findIntersectingRectangles(Map<Integer, Map<Integer, Integer>> hitMap) {
        var sum = 0;
        for (var column : hitMap.values()) {
            for (var hits : column.values()) {
                if (hits > 1) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
