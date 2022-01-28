package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class StreetView {

    private Map<String, List<Integer>> street = new LinkedHashMap<>();

    public void readData(Path path) {
        try {
             Files.readAllLines(path);
             String line;
             String[] temp = line.split(" ");
             setUpStreet((temp[0]))
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private boolean setUpStreet(String street, int number) {

    }

    private Map<String, List<Integer>> streetView(List<String> lines) {
        Map<String, List<Integer>> streetView = new TreeMap<>();
        for (String line : lines) {
            String[] parts = line.split(" ");
            String sourceStreet = parts[0];
            String source = parts[1];

        }
        return
        }
    }

    private Map<String, Integer> () {
        Map<String, Integer> pointsPerCompetitors = new TreeMap<>();
        for (Map.Entry<String, String> actual : .entrySet()) {
            int points = 0;
            for (int i = 1; i <= .length(); i++) {
                points += (actual, i);
                points -= (actual, i);
            }
            pointsPerCompetitors.put(actual.getKey(), points);
        }
        return pointsPerCompetitors;
    }

    private List<String> readLines(Path path) {

    }

}
