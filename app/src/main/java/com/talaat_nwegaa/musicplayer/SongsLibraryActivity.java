package com.talaat_nwegaa.musicplayer;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class SongsLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1-song name", "song time", "artist name"));
        songs.add(new Song("2-song name", "song time", "artist name"));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
