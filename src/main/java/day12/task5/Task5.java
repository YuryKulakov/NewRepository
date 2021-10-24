package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> band1 = new ArrayList<>(Arrays.asList(new MusicArtist("Colin Burgess", 23),
                new MusicArtist("Larry van Kriedt", 29), new MusicArtist("Dave Evans", 33),
                new MusicArtist("Chris Slade", 22)));

        MusicBand acDc = new MusicBand(1973, "AC/DC", band1);


        List<MusicArtist> list = new ArrayList<>(Arrays.asList(new MusicArtist("Robert Plant", 32),
                new MusicArtist("Jimmy Page", 40), new MusicArtist("John Paul Jones", 30),
                new MusicArtist("John Bonham", 36)));
        MusicBand ledZeppelin = new MusicBand(1968, "ledZeppelin", list);


        acDc.printMembers();
        ledZeppelin.printMembers();

        MusicBand.transferMembers(acDc, ledZeppelin);

        acDc.printMembers();
        ledZeppelin.printMembers();

    }
}
