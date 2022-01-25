package day02;

import java.util.List;

public class Movie {

    private String title;
    private List<String> actor;

    public Movie(String title, List<String> actor) {
        this.title = title;
        this.actor = actor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActor(List<String> actor) {
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActor() {
        return actor;
    }
}
