package com.example.rodak.playdance.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rodak.playdance.R;
import com.example.rodak.playdance.Utils.SongsList;
import com.example.rodak.playdance.Utils.SongsListAdapter;

import java.util.ArrayList;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        ArrayList<SongsList> popLists = new ArrayList<SongsList>();
        popLists.add(new SongsList("The Twist", "Chubby Checker"));
        popLists.add(new SongsList("Smooth", "Santana Featuring Rob Thomas"));
        popLists.add(new SongsList("Mack The Knife", "Bobby Darin"));
        popLists.add(new SongsList("How Do I Live", "LeAnn Rimes"));
        popLists.add(new SongsList("Party Rock Anthem", "LMFAO Featuring Lauren Bennett & GoonRock"));
        popLists.add(new SongsList("I Gotta Feeling", "The Black Eyed Peas"));
        popLists.add(new SongsList("Macarena (Bayside Boys Mix)", "Los Del Rio"));
        popLists.add(new SongsList("Physical", "Olivia Newton-John"));
        popLists.add(new SongsList("You Light Up My Life", "Debby Boone"));
        popLists.add(new SongsList("Hey Jude", "The Beatles"));
        popLists.add(new SongsList("We Belong Together", "Mariah Carey"));
        popLists.add(new SongsList("Uptown Funk!", "Mark Ronson Featuring Bruno Mars"));
        popLists.add(new SongsList("Un-Break My Heart", "Toni Braxton"));
        popLists.add(new SongsList("How Do I Live", "LeAnn Rimes"));
        popLists.add(new SongsList("Yeah!", "Usher Featuring Lil Jon & Ludacris"));
        popLists.add(new SongsList("I Gotta Feeling", "The Black Eyed Peas"));
        popLists.add(new SongsList("Bette Davis Eyes", "Kim Carnes"));
        popLists.add(new SongsList("Physical", "Olivia Newton-John"));
        popLists.add(new SongsList("You Light Up My Life", "Debby Boone"));
        popLists.add(new SongsList("Endless Love", "Jewel"));
        popLists.add(new SongsList("The Twist", "Chubby Checker"));
        popLists.add(new SongsList("Smooth", "Santana Featuring Rob Thomas"));
        popLists.add(new SongsList("Mack The Knife", "Bobby Darin"));
        popLists.add(new SongsList("Foolish Games/You Were Meant For Me", "Jewel"));
        popLists.add(new SongsList("Party Rock Anthem", "LMFAO Featuring Lauren Bennett & GoonRock"));
        popLists.add(new SongsList("I Gotta Feeling", "The Black Eyed Peas"));
        popLists.add(new SongsList("Macarena (Bayside Boys Mix)", "Los Del Rio"));
        popLists.add(new SongsList("Physical", "Olivia Newton-John"));
        popLists.add(new SongsList("You Light Up My Life", "Debby Boone"));
        popLists.add(new SongsList("Hey Jude", "The Beatles"));

        SongsListAdapter rockAdapter = new SongsListAdapter(this, popLists);
        ListView listView = (ListView) findViewById(R.id.pop_list);
        listView.setAdapter(rockAdapter);
    }
}
