package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.playMp4(fileName);
    }
}
