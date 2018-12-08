package se.bodenas.advent.Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HitAnalyzer {


    public int countIntersections(Map<Integer, Map<Integer, Hits>> hitMap) {
        var sum = 0;
        for (var column : hitMap.values()) {
            for (var hits : column.values()) {
                if (hits.size() > 1) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public String findAnyClaimWithoutOverlap(HashMap<String, Hits> scoreBoard) {
        return findAllClaimWithoutOverlap(scoreBoard).findAny().orElseThrow();
    }

    public Stream<String> findAllClaimWithoutOverlap(HashMap<String, Hits> scoreBoard) {
        return scoreBoard.entrySet().stream().filter(i->i.getValue().size()==1).map(Map.Entry::getKey);
    }
}
