package com.mibu.adapter;

public class AdapterSimpleToAdvancedMediaPlayer implements SimpleMediaPlayer {

  private AdvancedMediaPlayer mediaPlayer;

  public AdapterSimpleToAdvancedMediaPlayer(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      mediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      mediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    mediaPlayer.advancedPlay(fileName);
  }
}
