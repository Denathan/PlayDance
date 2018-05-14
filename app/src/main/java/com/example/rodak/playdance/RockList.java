package com.example.rodak.playdance;

public class RockList {
    private String title;
    private String artist;

    public RockList(String songTitle, String artistName)
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
