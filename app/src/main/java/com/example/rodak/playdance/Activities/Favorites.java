package com.example.rodak.playdance.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        ArrayList<SongsList> favoritesLists = new ArrayList<SongsList>();
        favoritesLists.add(new SongsList("Dupa", "1.6"));
        favoritesLists.add(new SongsList("Eclair", "2.0-2.1"));
        favoritesLists.add(new SongsList("Froyo", "2.2-2.2.3"));
        favoritesLists.add(new SongsList("GingerBread", "2.3-2.3.7"));
        favoritesLists.add(new SongsList("Honeycomb", "3.0-3.2.6"));
        favoritesLists.add(new SongsList("Ice Cream Sandwich", "4.0-4.0.4"));
        favoritesLists.add(new SongsList("Jelly Bean", "4.1-4.3.1"));
        favoritesLists.add(new SongsList("KitKat", "4.4-4.4.4"));
        favoritesLists.add(new SongsList("Lollipop", "5.0-5.1.1"));
        favoritesLists.add(new SongsList("Marshmallow", "6.0-6.0.1"));

        SongsListAdapter favoritesAdapter = new SongsListAdapter(this, favoritesLists);
        ListView listView = (ListView) findViewById(R.id.favorites_list);
        listView.setAdapter(favoritesAdapter);
    }
}
