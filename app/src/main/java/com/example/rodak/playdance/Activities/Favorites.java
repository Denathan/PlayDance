package com.example.rodak.playdance.Activities;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.rodak.playdance.R;
import com.example.rodak.playdance.Utils.SongsList;
import com.example.rodak.playdance.Utils.SongsListAdapter;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(myToolbar);
        setTitle(this.getString(R.string.favorites));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorOvercast), PorterDuff.Mode.SRC_ATOP);

        ArrayList<SongsList> favoritesLists = new ArrayList<SongsList>();
        favoritesLists.add(new SongsList("Macarena (Bayside Boys Mix)", "Los Del Rio"));
        favoritesLists.add(new SongsList("Physical", "Olivia Newton-John"));
        favoritesLists.add(new SongsList("You Light Up My Life", "Debby Boone"));
        favoritesLists.add(new SongsList("Hey Jude", "The Beatles"));
        favoritesLists.add(new SongsList("We Belong Together", "Mariah Carey"));
        favoritesLists.add(new SongsList("Black Sabbath", "Paranoid"));
        favoritesLists.add(new SongsList("Led Zeppelin", "Kashmir"));
        favoritesLists.add(new SongsList("The Rolling Stones", "Gimme Shelter"));
        favoritesLists.add(new SongsList("AC/DC", "Back in Black"));
        favoritesLists.add(new SongsList("The Beatles", "A Day in the Life"));
        favoritesLists.add(new SongsList("Aerosmith", "Sweet Emotion"));
        SongsListAdapter favoritesAdapter = new SongsListAdapter(this, favoritesLists);
        ListView listView = (ListView) findViewById(R.id.favorites_list);
        listView.setAdapter(favoritesAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent myIntent = new Intent(Favorites.this, MainActivity.class);
        Favorites.this.startActivity(myIntent);
        finish();
        return true;
    }
}
