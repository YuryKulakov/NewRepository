package day12.task5;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public MusicBand(int year, String name, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
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
        for (MusicArtist member : first.getMembers()) {

            second.getMembers().add(member);
        }

        first.getMembers().clear();

    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}

