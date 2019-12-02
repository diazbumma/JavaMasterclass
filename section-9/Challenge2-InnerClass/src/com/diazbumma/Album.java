package com.diazbumma;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songList = new SongList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public boolean addSong(String title, double duration) {
        return songList.addSong(title, duration);
    }

    public Song findSong(String title) {
        return songList.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        return songList.addToPlayList(trackNumber, playList);
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        return songList.addToPlayList(title, playList);
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<>();
        }

        public boolean addSong(String title, double duration) {
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
            int index = trackNumber -1;
            if((index >0) && (index <= this.songs.size())) {
                playList.add(this.songs.get(index));
                return true;
            }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }

        public boolean addToPlayList(String title, LinkedList<Song> playList) {
            Song checkedSong = findSong(title);
            if(checkedSong != null) {
                playList.add(checkedSong);
                return true;
            }
            System.out.println("The song " + title + " is not in this album");
            return false;
        }
    }
}
