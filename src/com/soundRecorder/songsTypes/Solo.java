package com.soundRecorder.songsTypes;

/**
 * Created by user on 16.03.2017.
 */
public class Solo extends VocalMusic {
    String vocalType;

    public Solo(String name,String composer,int time,String wordsAuther,String singer, String accompaniment,
                String vocalType) {
        this.name=name;
        this.composer=composer;
        this.time=time;
        this.wordsAuther=wordsAuther;
        this.singer=singer;
        this.accompaniment=accompaniment;
        this.vocalType = vocalType;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("\n#############################")
                .append("\nНазвание композиции: " )
                .append(this.name)
                .append("\nКомпозитор: ")
                .append(this.composer )
                .append("\nВремя: ")
                .append(this.time)
                .append("\nАвтор слов: ")
                .append(this.wordsAuther)
                .append("\nИсполнитель: ")
                .append(this.singer)
                .append("\nТип вокала: ")
                .append(this.vocalType)
                .append("\nАккомпанемент: ")
                .append(this.accompaniment);
        return sb.toString();
    }
}
