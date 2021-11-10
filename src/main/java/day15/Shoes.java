package day15;

public class Shoes {
    String name;
    int size;
    int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shoes(String name, int size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Обувь: " + name+ " Размер: " + size + " Количество: " + count + "\n";
    }
}
