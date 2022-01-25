package day02;

import java.util.List;

public class Movie {

    private String title;
    private int length;
    private List<String> actor;

    public Movie(String title, int length, List<String> actor) {
        this.title = title;
        this.length = length;
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getActor() {
        return actor;
    }
}
