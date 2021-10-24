package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand acdc = new MusicBand(1990, "ACDC");
        MusicBand metallica = new MusicBand(1995, "Metallica");
        MusicBand slipknot = new MusicBand(1989, "Slipknot");
        MusicBand rollingstones = new MusicBand(1980, "RollingStones");
        MusicBand linkinpark = new MusicBand(1992, "LinkinPark");
        MusicBand bts = new MusicBand(2017, "BTS");
        MusicBand imagineDragons = new MusicBand(2012, "ImagineDragons");
        MusicBand littleBig = new MusicBand(2020, "LittleBig");
        MusicBand gorillaz = new MusicBand(2001, "Gorillaz");
        MusicBand iowa = new MusicBand(2006, "IOWA");

        List<MusicBand> musicList = new ArrayList();
        musicList.add(0, acdc);
        musicList.add(1, metallica);
        musicList.add(2, slipknot);
        musicList.add(3, rollingstones);
        musicList.add(4, linkinpark);
        musicList.add(5, bts);
        musicList.add(6, imagineDragons);
        musicList.add(7, littleBig);
        musicList.add(8, gorillaz);
        musicList.add(9, iowa);

        Collections.shuffle(musicList);
        System.out.println(musicList);

        System.out.println(groupsAfter2000(musicList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicList) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand bands : musicList) {
            if (bands.getYear() > 2000) {
                groupsAfter2000.add(bands);

            }
        }
        return groupsAfter2000;
    }
}
