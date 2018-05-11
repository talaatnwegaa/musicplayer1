package com.talaat_nwegaa.musicplayer;

/**
 * Created by pc on 11-May-18.
 */

public class Song {
    private String aSongName;
    private String aSongTime;
    private String aArtistName;

    public Song(String songName, String songTime, String artistName) {
        aSongName = songName;
        aSongTime = songTime;
        aArtistName = artistName;
    }

    public String getSongName() {
        return aSongName;
    }

    public String getSongTime() {
        return aSongTime;
    }

    public String getArtistName() {return aArtistName;}

}
