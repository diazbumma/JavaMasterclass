package com.diazbumma;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
    }

    public static Album createAlbum(String albumName, String artist) {
        return new Album(albumName, artist);
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean hasSong() {
        return !songs.isEmpty();
    }

    public void showTrack() {
        if (songs.isEmpty()) {
            System.out.println("No songs.");
            return;
        }
        for (int i = 0; i < songs.size(); i++)
            System.out.println(i + ". " + songs.get(i).getTitle() + ", " + songs.get(i).getDuration() + " s");
    }

    public Song getSong(int trackNumber) {
        return songs.get(trackNumber);
    }
}
