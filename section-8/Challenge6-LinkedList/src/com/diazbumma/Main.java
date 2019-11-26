package com.diazbumma;

import java.util.*;

public class Main {

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()

    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static ArrayList<Album> collection  = new ArrayList<>();
    private static ListIterator<Song> listIterator;
    private static boolean isPlaying = false;
    private static boolean forward = true;

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int select = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (select) {
                case 1:
                    showPlaylist();
                    break;
                case 2:
                    albumMenu();
                    break;
                case 3:
                    addToPlaylist();
                    break;
                case 4:
                    removeFromPlaylist();
                    break;
                case 5:
                    nextSong();
                    break;
                case 6:
                    prevSong();
                    break;
                case 7:
                    replaySong();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Menu unrecognized.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Song Playlist Menu:\n" +
                "1. Show playlist\n" +
                "2. Album menu\n" +
                "3. Add to playlist\n" +
                "4. Remove from playlist\n" +
                "5. Next song\n" +
                "6. Previous song\n" +
                "7. Replay song\n" +
                "8. Quit\n" +
                "Enter menu: ");
    }

    public static void showPlaylist() {
        Iterator<Song> playlistIterator = playlist.iterator();
        if (!playlist.isEmpty()) {
            int i = 0;
            while (playlistIterator.hasNext()) {
                Song song = playlistIterator.next();
                System.out.println(i++ + ". " + song.getTitle() + ", " + song.getDuration() + " s");
            }
        } else {
            System.out.println("No track on playlist");
        }
    }

    public static void albumMenu() {
        System.out.println("Album menu:\n" +
                "1. Show collection\n" +
                "2. Add Album\n" +
                "3. Add Song\n" +
                "Enter album menu:");
        int select = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        switch (select) {
            case 1:
                showAlbum();
                break;
            case 2:
                addAlbum();
                break;
            case 3:
                addSongToAlbum();
                break;
            default:
                System.out.println("Menu unrecognized.");
        }
    }

    public static void addToPlaylist() {
        System.out.println("Select album");
        showAlbum();
        System.out.println("Enter album: ");
        int selectAlbum = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Select track");
        collection.get(selectAlbum).showTrack();
        System.out.println("Enter track number:");
        int selectSong = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        playlist.add(collection.get(selectAlbum).getSong(selectSong));
        isPlaying = false;
    }

    public static void removeFromPlaylist() {
        if (!playlist.isEmpty()) {
            if (!isPlaying) {
                listIterator = playlist.listIterator();
                isPlaying = true;
            }
            listIterator.remove();
        } else {
            System.out.println("Empty playlist.");
        }
    }

    public static void nextSong() {
        if (!playlist.isEmpty()) {
            if (!isPlaying) {
                listIterator = playlist.listIterator();
                isPlaying = true;
            }
            if (!forward) {
                listIterator.next();
                forward = true;
            }
            if (listIterator.hasNext()) {
                Song nowPlaying = listIterator.next();
                System.out.println("Now playing: " + nowPlaying.getTitle() + ", " + nowPlaying.getDuration());
            } else {
                System.out.println("End of playlist");
            }
        } else {
            System.out.println("Empty playlist.");
        }
    }

    public static void prevSong() {
        if (!playlist.isEmpty()) {
            if (!isPlaying) {
                listIterator = playlist.listIterator();
                isPlaying = true;
            }
            if (forward) {
                listIterator.previous();
                forward = false;
            }
            if (listIterator.hasPrevious()) {
                Song nowPlaying = listIterator.previous();
                System.out.println("Now playing: " + nowPlaying.getTitle() + ", " + nowPlaying.getDuration());
            } else {
                System.out.println("Start of playlist");
            }
        } else {
            System.out.println("Empty playlist.");
        }
    }

    public static void replaySong() {
        if (!playlist.isEmpty()) {
            if (!isPlaying) {
                listIterator = playlist.listIterator();
                isPlaying = true;
            }
            if (listIterator.hasPrevious()) {
                Song nowPlaying = listIterator.previous();
                System.out.println("Now playing: " + nowPlaying.getTitle() + ", " + nowPlaying.getDuration());
            } else {
                System.out.println("Start of playlist");
            }
        } else {
            System.out.println("Empty playlist.");
        }
    }

    public static boolean showAlbum() {
        if (!collection.isEmpty()) {
            for (int i = 0; i < collection.size(); i++) {
                System.out.println(i + ". " +
                        collection.get(i).getAlbumName() + " by " +
                        collection.get(i).getArtist());
            }
            return true;
        } else {
            System.out.println("No Album");
            return false;
        }
    }

    public static void addAlbum() {
        System.out.println("Enter album name: ");
        String albumName = scanner.nextLine();
        System.out.println("Enter artist name: ");
        String artist = scanner.nextLine();
        collection.add(Album.createAlbum(albumName, artist));
    }

    public static void addSongToAlbum() {
        if (showAlbum()) {
            System.out.println("Select album: ");
            int select = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println("Enter song title: ");
            String songTitle = scanner.nextLine();
            System.out.println("Enter duration: ");
            int duration = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            collection.get(select).addSong(Song.newSong(songTitle, duration));
        } else {
            System.out.println("No Album. Make album first.");
        }
    }
}
