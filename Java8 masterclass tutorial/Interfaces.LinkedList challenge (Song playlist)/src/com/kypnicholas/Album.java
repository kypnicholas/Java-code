package com.kypnicholas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nkypr on 09/07/2017.
 */
public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();             //initialise the ArrayList
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songs) {                 //equivalent of FOR EACH. Creates a 'checkedSong' variable for each entry in the list
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index=trackNumber-1;                            //humans start from 1, machines start lists from 0.
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong=findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


}
