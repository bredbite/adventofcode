package se.bodenas.advent.Day3;

import java.util.ArrayList;
import java.util.List;

public class ClaimParser {

    public List<Claim> parse(List<String> lines) {
        List<Claim> claims = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.replaceAll(" ", "").split("([#@:,x])");

            Rectangle rectangle = new Rectangle(split[2], split[3], split[4], split[5]);
            claims.add(new Claim(split[1], rectangle));

        }
        return claims;
    }
}
