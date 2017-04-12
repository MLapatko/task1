package com.soundRecorder;

import com.soundRecorder.songsTypes.Solo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 21.03.2017.
 */
    public class SoloDisk {
    private List<Solo> songs;

    public SoloDisk(List<Solo> songs) {
        this.songs = songs;
    }

    public List<Solo> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return songs.toString();
    }
    public   int findTotalTime() {
        int totalTime = 0;
        for (int i = 0; i < this.songs.size(); i++) {
            totalTime += this.songs.get(i).getTime();
        }
        return totalTime;
    }
    public List<Solo> findSinger(String singer){
        List <Solo> searchResult=new ArrayList<>();
        for (int i = 0; i <this.songs.size() ; i++) {
            if (this.songs.get(i).getSinger().equals(singer))
                searchResult.add(this.songs.get(i));
        }
        return searchResult;
    }
    public void sortName(){
        Collections.sort(this.songs, new Comparator<Solo>(){
            @Override
            public int compare(Solo o1,Solo o2){
                return  o1.getName().compareTo(o2.getName());
            }
        });
    }
}
