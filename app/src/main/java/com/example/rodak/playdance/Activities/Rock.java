package com.example.rodak.playdance.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rodak.playdance.R;
import com.example.rodak.playdance.Utils.SongsList;
import com.example.rodak.playdance.Utils.SongsListAdapter;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        ArrayList<SongsList> songsLists = new ArrayList<SongsList>();
        songsLists.add(new SongsList("Aerosmith", "Sweet Emotion"));
        songsLists.add(new SongsList("Led Zeppelin", "Kashmir"));
        songsLists.add(new SongsList("The Rolling Stones", "Gimme Shelter"));
        songsLists.add(new SongsList("AC/DC", "Back in Black"));
        songsLists.add(new SongsList("The Beatles", "A Day in the Life"));
        songsLists.add(new SongsList("The Jimi Hendrix Experience", "All Along the Watchtower"));
        songsLists.add(new SongsList("Queen", "Bohemian Rhapsody"));
        songsLists.add(new SongsList("Van Halen", "Everybody Wants Some!!"));
        songsLists.add(new SongsList("Pink Floyd", "Comfortably Numb"));
        songsLists.add(new SongsList("Black Sabbath", "Paranoid"));
        songsLists.add(new SongsList("Aerosmith", "Sweet Emotion"));
        songsLists.add(new SongsList("Led Zeppelin", "Kashmir"));
        songsLists.add(new SongsList("The Rolling Stones", "Gimme Shelter"));
        songsLists.add(new SongsList("AC/DC", "Back in Black"));
        songsLists.add(new SongsList("Van Halen", "Everybody Wants Some!!"));
        songsLists.add(new SongsList("Pink Floyd", "Comfortably Numb"));
        songsLists.add(new SongsList("Black Sabbath", "Paranoid"));
        songsLists.add(new SongsList("Led Zeppelin", "Kashmir"));
        songsLists.add(new SongsList("The Rolling Stones", "Gimme Shelter"));
        songsLists.add(new SongsList("AC/DC", "Back in Black"));
        songsLists.add(new SongsList("The Beatles", "A Day in the Life"));
        songsLists.add(new SongsList("Aerosmith", "Sweet Emotion"));
        songsLists.add(new SongsList("Led Zeppelin", "Kashmir"));
        songsLists.add(new SongsList("The Rolling Stones", "Gimme Shelter"));
        songsLists.add(new SongsList("AC/DC", "Back in Black"));

        SongsListAdapter rockAdapter = new SongsListAdapter(this, songsLists);
        ListView listView = (ListView) findViewById(R.id.rock_list);
        listView.setAdapter(rockAdapter);
    }
}
