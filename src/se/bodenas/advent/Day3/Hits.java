package se.bodenas.advent.Day3;

import java.util.*;

public class Hits {
    private List<String> hits = new ArrayList<>();

    public void addHit(String id) {
        hits.add(id);
    }

    public int size() {
        return hits.size();
    }

    public List<String> getAll() {
        return Collections.unmodifiableList(hits);
    }
}
