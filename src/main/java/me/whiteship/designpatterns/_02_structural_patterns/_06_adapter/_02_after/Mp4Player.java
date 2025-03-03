package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
