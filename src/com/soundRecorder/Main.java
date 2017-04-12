/*Звукозапись. Определить иерархию музыкальных композиций.
Записать на диск сборку. Посчитать продолжительность.
Провести перестановку композиций диска на основе одного из параметров.
Найти композицию, соответствующую заданному диапазону параметров*/
package com.soundRecorder;

import com.soundRecorder.songsTypes.Solo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SoloDisk soloMusicDisk;
        DickBuilder diskbuilder=new DickBuilder();
        String singer="Федор Шаляпин";
        serialize("songs.bin");
        try (FileInputStream fi=new FileInputStream("songs.bin")){
            ObjectInputStream oi=new ObjectInputStream(fi);
            soloMusicDisk=diskbuilder.createDisk((List)oi.readObject());
            System.out.println("Диск с сольной музыкой: ");
            System.out.println(soloMusicDisk);
            System.out.println();


            System.out.println("Общее время диска с сольной музыкой: "+soloMusicDisk.findTotalTime()+"c");
            System.out.println();
            soloMusicDisk.sortName();
            System.out.println("Диск с сольной музыкой отсортированный в алфавитном порядке по названию композициии: "
                    +soloMusicDisk);
            System.out.println("Песни, где солист Федор Шаляпин: "+soloMusicDisk.findSinger(singer));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void serialize(String s){
        List <Solo> solo=new ArrayList<>();
        solo.add(new Solo("Куплеты Мефистофеля","Шарль Гуно",117,"Шарль Гуно","Федор Шаляпин",
                "хор и оркестр Большого театра","бас"));
        solo.add(new Solo("Блоха"," М. П. Мусоргский",173," В. И. Гёте","Федор Шаляпин","без сопровождения","бас"));
        solo.add(new Solo("Маскарад","М. Магомаева",252,"И. Шаферан","М. Магомаева",
                "эстрадно-симфонический оркестр Всесоюзного радио и Центрального телевидения","баритон"));
        try(FileOutputStream fs=new FileOutputStream("songs.bin")){
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(solo);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
