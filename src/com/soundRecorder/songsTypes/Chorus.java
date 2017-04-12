package com.soundRecorder.songsTypes;

/**
 * Created by user on 16.03.2017.
 */
public class Chorus extends VocalMusic {
    String chorusType;
    public void play(){
        System.out.println("Chorus is singing");
    }

    public Chorus(String name,String composer,int time,String wordsAuther,String singer, String accompaniment,
                  String chorusType) {
        this.chorusType = chorusType;
        this.name=name;
        this.composer=composer;
        this.time=time;
        this.wordsAuther=wordsAuther;
        this.singer=singer;
        this.accompaniment=accompaniment;
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
                .append(this.time)
                .append("\nАвтор слов = ")
                .append(this.wordsAuther)
                .append("\nИсполнитель = ")
                .append(this.singer)
                .append("\nТип хора = ")
                .append(this.chorusType)
                .append("\nАккомпанемент = ")
                .append(this.accompaniment);
        return sb.toString();
    }
}
