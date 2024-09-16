public class Fish {
    private int length;
    private String name;

    public Fish(String n, int l) {
        length = l;
        name = n;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
