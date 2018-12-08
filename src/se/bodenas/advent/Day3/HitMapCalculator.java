package se.bodenas.advent.Day3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HitMapCalculator {


    public Map<Integer, Map<Integer, Hits>> calculateHitMap(List<Claim> claims) {
        var hitMap = new HashMap<Integer, Map<Integer, Hits>>();
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
                    var hits = column.computeIfAbsent(y, h -> new Hits());
                    hits.addHit(claim.getId());
                }
            }
        }
        return hitMap;
    }

    public HashMap<String, Hits> calculateOverlapScoreBoard(List<Claim> claims) {
        var scoreBoard = new HashMap<String, Hits>();
        for(var claim : claims){
            scoreBoard.put(claim.getId(), new Hits());
        }
        var hitMap = new HashMap<Integer, Map<Integer, Hits>>();
        for (var claim : claims) {
            var rectangle = claim.getRectangle();
            int xInit = rectangle.getX();
            int yInit = rectangle.getY();
            int width = rectangle.getWidth();
            int height = rectangle.getHeight();
            for (int i = 0; i < width; i++) {
                int x = xInit + i;
                var column = hitMap.computeIfAbsent(x, k -> new HashMap<>());
                for (int j = 0; j < height; j++) {
                    int y = yInit + j;
                    var hitMapHits = column.computeIfAbsent(y, k -> new Hits());
                    hitMapHits.addHit(claim.getId());
                    hitMapHits.getAll().forEach(claimId -> scoreBoard.get(claimId).addHit(claimId));
                }
            }
        }
        return scoreBoard;
    }

}
