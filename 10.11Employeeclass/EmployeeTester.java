public class EmployeeTester {
    public static void main(String[] args) {
        Employee roger = new Employee("Roger", 15, 100000);
        Employee wenhao = new Employee("wenhao");
        wenhao.setAge(14);
        wenhao.setSalary(2);
        System.out.println(roger);
        System.out.println(wenhao);
    }
}
