package com.cb.structural.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();

        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "alone.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");
        mediaPlayer.play("avi", "mind me.avi");
    }
}
