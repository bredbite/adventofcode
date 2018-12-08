package se.bodenas.advent.Day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HitMapCalculator {


    public Map<Integer, Map<Integer, Integer>> calculate(List<Claim> claims) {
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
}
