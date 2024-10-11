public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String str) {
        name = str;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + " age: " + age + " salary:" + salary;
    }

}
