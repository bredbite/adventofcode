package se.bodenas.advent.Day3;

import java.util.Map;

public class IntersectionFinder {


    public int find(Map<Integer, Map<Integer, Integer>> hitMap) {
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
