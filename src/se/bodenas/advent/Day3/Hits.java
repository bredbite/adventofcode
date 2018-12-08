package se.bodenas.advent.Day3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hits {
    private Set<String> hits = new HashSet<>();

    public void addHit(String id) {
        hits.add(id);
    }

    public int size() {
        return hits.size();
    }

    public Set<String> getAll() {
        return Collections.unmodifiableSet(hits);
    }
}
