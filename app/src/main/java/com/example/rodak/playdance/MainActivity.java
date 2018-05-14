package com.example.rodak.playdance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void favoritesBtn(View view) {
        Intent favorites_intent = new Intent(MainActivity.this, Favorites.class);
        startActivity(favorites_intent);
        Toast.makeText(MainActivity.this, getResources().getString(R.string.favorites), Toast.LENGTH_LONG).show();
    }

    public void rockBtn(View view) {
        Intent rock_intent = new Intent(MainActivity.this, Rock.class);
        startActivity(rock_intent);
        Toast.makeText(MainActivity.this, getResources().getString(R.string.rock), Toast.LENGTH_LONG).show();
    }

    public void electronicBtn(View view) {
        Intent electronic_intent = new Intent(MainActivity.this, Electronic.class);
        startActivity(electronic_intent);
        Toast.makeText(MainActivity.this, getResources().getString(R.string.electronic), Toast.LENGTH_LONG).show();
    }

    public void popBtn(View view) {
        Intent pop_intent = new Intent(MainActivity.this, Pop.class);
        startActivity(pop_intent);
        Toast.makeText(MainActivity.this, getResources().getString(R.string.pop), Toast.LENGTH_LONG).show();
    }
}
