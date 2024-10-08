public class student {
    private String name;
    private int grade;

    public student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return name + " " + grade;
    }
}
