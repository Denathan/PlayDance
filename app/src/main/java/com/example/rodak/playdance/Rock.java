package com.example.rodak.playdance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<RockList> rockLists = new ArrayList<RockList>();
        rockLists.add(new RockList("Donut", "1.6"));
        rockLists.add(new RockList("Eclair", "2.0-2.1"));
        rockLists.add(new RockList("Froyo", "2.2-2.2.3"));
        rockLists.add(new RockList("GingerBread", "2.3-2.3.7"));
        rockLists.add(new RockList("Honeycomb", "3.0-3.2.6"));
        rockLists.add(new RockList("Ice Cream Sandwich", "4.0-4.0.4"));
        rockLists.add(new RockList("Jelly Bean", "4.1-4.3.1"));
        rockLists.add(new RockList("KitKat", "4.4-4.4.4"));
        rockLists.add(new RockList("Lollipop", "5.0-5.1.1"));
        rockLists.add(new RockList("Marshmallow", "6.0-6.0.1"));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        RockListAdapter flavorAdapter = new RockListAdapter(this, rockLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.rock_list);
        listView.setAdapter(flavorAdapter);
    }
}
