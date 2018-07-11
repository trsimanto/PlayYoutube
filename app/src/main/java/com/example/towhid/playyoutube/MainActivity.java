package com.example.towhid.playyoutube;


import android.os.Bundle;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;





public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    public static final String API_KEY="AIzaSyD3YX6AmoChnQga8qREp_J5P1PYF2ZV5qc";
    public static final String VIDEO_ID="b2dM1lsupdY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing Youtube player view
        YouTubePlayerView youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY,this);


    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        //add listeners to Youtube player instance
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);


        //start Buffering
        if(!wasRestored)
            player.cueVideo(VIDEO_ID);


    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Fail to initial", Toast.LENGTH_SHORT).show();
    }


    private PlaybackEventListener playbackEventListener= new PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };
    private PlayerStateChangeListener playerStateChangeListener=new PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(ErrorReason errorReason) {

        }
    };




}
