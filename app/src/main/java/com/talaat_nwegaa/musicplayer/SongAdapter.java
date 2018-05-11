package com.talaat_nwegaa.musicplayer;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pc on 11-May-18.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    private int mColorResourceId;

    public SongAdapter(Activity context, ArrayList<Song> songs, int colorResourceId) {

        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView songTime = (TextView) listItemView.findViewById(R.id.song_time);
        songTime.setText(currentSong.getSongTime());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}