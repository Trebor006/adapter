package com.mibu.adapter;

public class Mp3Player implements SimpleMediaPlayer {

  private AdapterSimpleToAdvancedMediaPlayer adapter;

  public Mp3Player() {}

  @Override
  public void play(String audioType, String fileName) {
    // inbuilt support to play mp3 music files
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
    }

    // mediaAdapter is providing support to play other file formats
    else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      adapter = new AdapterSimpleToAdvancedMediaPlayer(audioType);
      adapter.play(audioType, fileName);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported");
    }
  }
}
