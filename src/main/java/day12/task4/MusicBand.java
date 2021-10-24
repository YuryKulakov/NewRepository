package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<String> members = new ArrayList<>();

    public MusicBand(int year, String name, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void transferMembers(MusicBand first, MusicBand second) {
        for (String member : first.getMembers()) {

            second.getMembers().add(member);
        }

        first.getMembers().clear();

    }

    public void printMembers() {
        System.out.println(this.members);
    }
}

