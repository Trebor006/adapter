package com.mibu.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

  public Mp4Player() {
  }

  @Override
  public void advancedPlay(String fileName) {
    System.out.println("Playing mp4 file. Name: " + fileName);
  }
}
