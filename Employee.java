public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;

    public Employee(int id, String name, String email, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Email=" + email + ", Salary=" + salary + "]";
    }
}
