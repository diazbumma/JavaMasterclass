package com.diazbumma;

public class Song {

    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Song newSong(String title, int duration) {
        return new Song(title, duration);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
