package com.example.rodak.playdance.Utils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rodak.playdance.R;

import java.util.ArrayList;

public class SongsListAdapter extends ArrayAdapter<SongsList> {
    private static final String LOG_TAG = SongsListAdapter.class.getSimpleName();


    public SongsListAdapter(Activity context, ArrayList<SongsList> songsArray) {
        super(context, 0, songsArray);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        SongsList songsList = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_title);
        nameTextView.setText(songsList.getSongtitle());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        numberTextView.setText(songsList.getArtistName());
        return listItemView;
    }
}
