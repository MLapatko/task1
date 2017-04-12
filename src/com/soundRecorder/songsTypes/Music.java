package com.soundRecorder.songsTypes;

import java.io.Serializable;

/**
 * Created by user on 16.03.2017.
 */
public class Music implements Serializable{
     String name;
     String composer;
     int time;

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getComposer() {
        return composer;
    }

    public void play(){
        System.out.println("Music is playing");
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("\n#############################")
                .append("\nНазвание композиции = " )
                .append(this.name)
                .append("\nКомпозитор = ")
                .append(this.composer )
                .append("\nВремя = ")
                .append(this.time);
        return sb.toString();
    }
}
