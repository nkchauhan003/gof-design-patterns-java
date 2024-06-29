package com.cb.structural.adapter.clazz;


import com.cb.structural.adapter.MediaPlayer;
import com.cb.structural.adapter.Mp4Player;

public class MediaAdapter extends Mp4Player implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            super.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            // Adaptation logic for VLC format (if needed)
            System.out.println("Adapter is converting VLC format to MP4.");
            super.playMp4(fileName); // Example adaptation: assuming VLC can be played as MP4
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
