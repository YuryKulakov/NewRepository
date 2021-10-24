package day12.task3;

public class MusicBand {
    private int year;
    private String name;

    public MusicBand(int year, String name) {
        this.name = name;
        this.year = year;

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
    @Override
    public String toString() {
        return "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
