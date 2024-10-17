class athletetester {
    public static void main(String[] args) {
        SoccerPlayer p1 = new SoccerPlayer("Roger");
        p1.calcConditioningLevel(2);
        p1.setAge(10);
        System.out.println(p1);

        FootballPlayer p2 = new FootballPlayer("Ryan", 22);
        p2.calcConditioningLevel(3);
        System.out.println(p2);

    }
}

abstract class athlete {
    private double condLevel;
    private String name;
    private int age;

    public abstract void calcConditioningLevel(int level);

    public void setName(String name) {
        this.name = name;
    }

    public void setCondLevel(double condLevel) {
        this.condLevel = condLevel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getCondLevel() {
        return condLevel;
    }

    public String getName() {
        return getName();
    }

    public String toString() {
        return name + " , Conditioning level: " + condLevel + " AGE: " + age;
    }

}

class SoccerPlayer extends athlete {
    public SoccerPlayer(String name) {
        setName(name);
    }

    public SoccerPlayer(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void calcConditioningLevel(int level) {
        setCondLevel(level * 2);
    }
}

class FootballPlayer extends athlete {
    public FootballPlayer(String name) {
        setName(name);
    }

    public FootballPlayer(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void calcConditioningLevel(int level) {
        setCondLevel(level * 3);
    }
}