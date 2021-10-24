package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> band1 = new ArrayList<>();
        band1.add("Colin Burgess");
        band1.add("Larry van Kriedt");
        band1.add("Dave Evans");
        band1.add("Chris Slade");

        MusicBand acDc = new MusicBand(1973, "AC/DC", band1);

        List<String> band2 = new ArrayList<>();
        band2.add("Robert Plant");
        band2.add("Jimmy Page");
        band2.add("John Paul Jones");
        band2.add("John Bonham");

        MusicBand ledZeppelin = new MusicBand(1968, "ledZeppelin", band2);

        acDc.printMembers();
        ledZeppelin.printMembers();

        MusicBand.transferMembers(acDc, ledZeppelin);

        acDc.printMembers();
        ledZeppelin.printMembers();



    }
}
