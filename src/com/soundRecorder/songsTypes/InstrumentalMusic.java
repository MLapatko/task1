package com.soundRecorder.songsTypes;

/**
 * Created by user on 16.03.2017.
 */
public class InstrumentalMusic extends Music {
    String instruments;
    @Override
    public void play(){
        System.out.println("Instrumental music is plaing");
    }
  public InstrumentalMusic(String name, String composer, int time,String instruments) {
        this.instruments = instruments;
        this.name = name;
        this.composer = composer;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Инструменты = " + instruments;
    }
}
