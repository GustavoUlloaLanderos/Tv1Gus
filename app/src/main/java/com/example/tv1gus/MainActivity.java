package com.example.tv1gus;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController (this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://unlimited1-cl-movistar.dps.live/cnn/cnn.smil/playlist.m3u8?PlaylistM3UCL");

        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


        }
    }
