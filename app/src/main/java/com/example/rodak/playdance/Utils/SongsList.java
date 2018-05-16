package com.example.rodak.playdance.Utils;

public class SongsList {
    private String title;
    private String artist;

    public SongsList(String songTitle, String artistName)
    {
        title = songTitle;
        artist = artistName;
    }

    /**
     * Get the name of the Android version
     */
    public String getSongtitle() {
        return title;
    }

    /**
     * Get the Android version number
     */
    public String getArtistName() {
        return artist;
    }
}
