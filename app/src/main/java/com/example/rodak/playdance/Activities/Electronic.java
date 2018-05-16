package com.example.rodak.playdance.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rodak.playdance.R;
import com.example.rodak.playdance.Utils.SongsList;
import com.example.rodak.playdance.Utils.SongsListAdapter;

import java.util.ArrayList;

public class Electronic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);

        ArrayList<SongsList> electronicLists = new ArrayList<SongsList>();
        electronicLists.add(new SongsList("Push The Tempo", "Fatboy Slim"));
        electronicLists.add(new SongsList("Around The World", "Daft Punk"));
        electronicLists.add(new SongsList("I'm blue", "Eiffel65"));
        electronicLists.add(new SongsList("If You're Over Me", "Years & Years"));
        electronicLists.add(new SongsList("When We Were Young (feat. Norma Jean Martine)", "Lost Kings"));
        electronicLists.add(new SongsList("Happy Man", "Jungle"));
        electronicLists.add(new SongsList("Jumpin'", "Reebs"));
        electronicLists.add(new SongsList("Bad Decision", "Chromeo"));
        electronicLists.add(new SongsList("The Sun (feat. Graham Candy)", "Parov Stelar"));
        electronicLists.add(new SongsList("I Wanna Know (feat. Daya)", "RL Grime"));
        electronicLists.add(new SongsList("Higher Ground (feat. Naomi Wild)", "ODESZA"));
        electronicLists.add(new SongsList("Ride Or Die (feat. Foster the People)", "The Knocks"));
        electronicLists.add(new SongsList("Fireflies", "Owl City"));
        electronicLists.add(new SongsList("Subtle Thing", "Years & Years"));
        electronicLists.add(new SongsList("Down", "Lost Down"));
        electronicLists.add(new SongsList("Happy Man", "Jungle"));
        electronicLists.add(new SongsList("Jumpin'", "Reebs"));
        electronicLists.add(new SongsList("Bad Decision", "Chromeo"));
        electronicLists.add(new SongsList("The Sun (feat. Graham Candy)", "Parov Stelar"));
        electronicLists.add(new SongsList("Summer", "Marshmello"));
        electronicLists.add(new SongsList("Higher Ground (feat. Naomi Wild)", "ODESZA"));
        electronicLists.add(new SongsList("Ride Or Die (feat. Foster the People)", "The Knocks"));
        electronicLists.add(new SongsList("Fireflies", "Owl City"));

        SongsListAdapter electronicAdapter = new SongsListAdapter(this, electronicLists);
        ListView listView = (ListView) findViewById(R.id.electronic_list);
        listView.setAdapter(electronicAdapter);
    }
}
