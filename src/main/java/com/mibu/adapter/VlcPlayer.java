package com.mibu.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

  public VlcPlayer() {}

  @Override
  public void advancedPlay(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }
}
